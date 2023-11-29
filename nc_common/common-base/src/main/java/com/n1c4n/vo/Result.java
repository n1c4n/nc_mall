package com.n1c4n.vo;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import com.n1c4n.enums.BusinessEnum;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result<T> {

    private Integer code = 200;
    private String msg = "OK";
    private T data;

public static <T> Result<T> success(T data) {
    Result<T> result = new Result<>();
    result.setData(data);
    return result;
}

    public static <T> Result<T> fail(String msg) {
        Result<T> result = new Result<>();
        result.setCode(500);
        result.setMsg(msg);
        return result;
    }

    public static <T> Result<T> fail(BusinessEnum businessEnum) {
        Result<T> result = new Result<>();
        result.setCode(businessEnum.getCode());
        result.setMsg(businessEnum.getDesc());
        return result;
    }

    public static <T> Result<T> fail(Integer code, String msg) {
        Result<T> result = new Result<>();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }

}
