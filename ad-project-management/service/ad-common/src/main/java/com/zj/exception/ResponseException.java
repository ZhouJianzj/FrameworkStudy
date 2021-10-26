package com.zj.exception;

/**
 * 自定义的异常，使用处理响应出错的
 * @author zhoujian
 */
public class ResponseException extends Exception {

    public ResponseException(String message) {
        super(message);
    }
}
