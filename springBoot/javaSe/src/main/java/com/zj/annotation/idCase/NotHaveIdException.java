package com.zj.annotation.idCase;

/**
 * @author zhoujian
 * 没有id的时候出现的异常
 */
public class NotHaveIdException extends RuntimeException {
    public NotHaveIdException() {
    }

    public NotHaveIdException(String message) {
        super(message);
    }
}
