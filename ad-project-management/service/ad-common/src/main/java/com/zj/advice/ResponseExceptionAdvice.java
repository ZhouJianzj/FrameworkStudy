package com.zj.advice;

import com.zj.cro.ResponseCommon;
import com.zj.exception.ResponseException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * 当请求发生异常之后统一设置响应的
 * @author zhoujian
 */
@RestControllerAdvice
public class ResponseExceptionAdvice {

    /**
     * 当在开发的时候抛出ResponseException异常的时候，会到这个指定的方法处理
     * 还可以指定多个这样的来处理不同的异常
     * @param request
     * @param ex
     * @return
     */
    @ExceptionHandler(value = ResponseException.class)
    public ResponseCommon<String> exceptionHandler400(HttpServletRequest request,
                                                   ResponseException ex){

        ResponseCommon<String> exceptionsResponse = new ResponseCommon<>("400",
                ex.getMessage());

        return exceptionsResponse;
    }
}
