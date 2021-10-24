package com.zj.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
@Slf4j
public class PostFilter  extends ZuulFilter {
    @Override
    public String filterType() {
        return FilterConstants.POST_TYPE;
    }

    @Override
    public int filterOrder() {
        //zai error之前一个执行
        return FilterConstants.FORM_BODY_WRAPPER_FILTER_ORDER -1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        //获取请求在pre中开始的时间
        long s = (long) ctx.get("startTime:");
        long e = System.currentTimeMillis();
        //使用日志框架打印耗时
        log.info(request.getRequestURI() + "请求耗时:" + (e-s)/10 + "ms");
        return null;
    }
}
