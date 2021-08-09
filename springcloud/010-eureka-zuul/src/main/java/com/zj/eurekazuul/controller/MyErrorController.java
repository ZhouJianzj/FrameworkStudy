package com.zj.eurekazuul.controller;

import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 只有过滤器异常发生了才会执行这个 异常过滤器
 */
@Controller
public class MyErrorController implements ErrorController {
    @Override
    public String getErrorPath() {
        return "/error";
    }

    @RequestMapping("/error")
    @ResponseBody
    public String error(){
        ZuulException throwable = (ZuulException) RequestContext.getCurrentContext().getThrowable();
        return throwable.nStatusCode + throwable.getMessage() + "================";
    }
}
