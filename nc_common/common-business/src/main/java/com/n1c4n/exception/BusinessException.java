package com.n1c4n.exception;

/**
 * 业务异常
 */
public class BusinessException extends RuntimeException{
    public BusinessException() {
        super();
    }

    public BusinessException(String message) {
        super(message);
    }
}

