package com.zj.advice;

import com.zj.annotation.IgnoreResponseAdvice;
import com.zj.cro.ResponseCommon;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 * @author zhoujian
 *
 * 实现对响应体的增强的，也就是统一响应体的格式的
 * @RestControllerAdvice:表示的这个类是rest增强类
 */
@RestControllerAdvice
public class ResponseCommonAdvice implements ResponseBodyAdvice<Object> {

    /**
     * 判断请求时候支持增强的
     * @param methodParameter
     * @param aClass
     * @return
     * @SuppressWarnings("all"):镇压所有警告
     */
    @Override
    @SuppressWarnings("all")
    public boolean supports(MethodParameter methodParameter,
                            Class<? extends HttpMessageConverter<?>> aClass) {
        //判断请求对象是否使用我们自己的自定义注解，是就忽略增强
        //获取使用在类上面的自定义注解
        if (methodParameter.getDeclaringClass().isAnnotationPresent(
                IgnoreResponseAdvice.class)){
            return false;
        }
        //获取使用在方法上面的注解
        if (methodParameter.getMethod().isAnnotationPresent(
                IgnoreResponseAdvice.class)){
            return false;
        }
        return true;
    }

    /**
     * 在数据写入响应体之前做增强的
     * @param o  将要写入响应体的响应对象
     * @param methodParameter
     * @param mediaType
     * @param aClass
     * @param serverHttpRequest
     * @param serverHttpResponse
     * @return
     */
    @Override
    public Object beforeBodyWrite(Object o,
                                  MethodParameter methodParameter,
                                  MediaType mediaType,
                                  Class<? extends HttpMessageConverter<?>> aClass,
                                  ServerHttpRequest serverHttpRequest,
                                  ServerHttpResponse serverHttpResponse) {
        ResponseCommon<Object> response = new ResponseCommon<Object>("200","");
        if (null == o){
            //没有就执行响应一个初始的响应
            return  response;
        }else if ( o instanceof ResponseBody){
            //如有已经是一个统一的响应对象了就转一下
            response = (ResponseCommon<Object>) o;
        }else {
            //如果是一个普通的数据对象，就传入统一响应对象中去
            response.setData(o);
        }
        return response;
    }
}
