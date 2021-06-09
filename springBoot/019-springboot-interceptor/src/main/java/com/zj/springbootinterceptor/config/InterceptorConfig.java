package com.zj.springbootinterceptor.config;

import com.zj.springbootinterceptor.interceptor.UserInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 1、@Configuration ：拦截器配置类的注解
 * 2、需要实现WebMvcConfigurer接口,重写里面的方法
 * public void addInterceptors(InterceptorRegistry registry) {}
 */
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//        默认的没填写会拦截所有的
        String[] addPathPatterns = {
                "/user/login/**"
        };
//        没有放行登录的path的时候会出现第一次正常拦截，再一次请求的时候会出现成功
        String[] excludePatterns = {
                "/user/login/out",
                "/user/login/Error",
                "/user/login/detail/**"
        };
        registry.addInterceptor(new UserInterceptor()).
                addPathPatterns(addPathPatterns)
                .excludePathPatterns(excludePatterns);
    }
}
