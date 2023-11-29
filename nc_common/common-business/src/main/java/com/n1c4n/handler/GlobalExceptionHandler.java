package com.n1c4n.handler;

import com.n1c4n.enums.BusinessEnum;
import com.n1c4n.exception.BusinessException;
import com.n1c4n.vo.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;

@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    /**
     * 这里的业务异常希望用户看到
     *
     * @param e
     * @return
     */
    @ExceptionHandler(BusinessException.class)
    public Result<String> businessExHandler(BusinessException e) {
        return Result.fail(BusinessEnum.OPERATION_FAIL.getCode(), e.getMessage());
    }

    /**
     * 这个非业务异常记录下来
     *
     * @param e
     * @return
     */
    @ExceptionHandler(RuntimeException.class)
    public Result<String> runtimeExHandler(RuntimeException e) {
        log.error("=============runtimeEx=========", e);
        return Result.fail(BusinessEnum.SERVER_INNER_ERROR.getCode(),e.getMessage());
    }


    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Result<String> methodArgumentNotValidExExHandler(MethodArgumentNotValidException e) {
        List<ObjectError> allErrors = e.getAllErrors();
        StringBuilder sb = new StringBuilder();
        allErrors.forEach(objectError -> {
            String message = objectError.getDefaultMessage();
            sb.append(message + "\n");
        });

        String realMsg = sb.delete(sb.lastIndexOf("\n"), sb.length()).toString();
        return Result.fail(BusinessEnum.OPERATION_FAIL.getCode(), realMsg);
    }
}
