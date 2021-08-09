package com.zj.eurekazuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
public class Myfliter extends ZuulFilter {
    /**
     *
     * @return  指定过滤器的执行时机
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     *
     * @return  多个过滤器的执行顺序，数字越小越先执行
     */
    @Override
    public int filterOrder() {
        return 1;
    }

    /**
     *
     * @return 是否开启 这个过滤器
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     *
     * @return 过滤器的进行过滤的具体实现
     * @throws ZuulException
     */
    @Override
    public Object run() throws ZuulException {
//       只有过滤器发生了异常才会执行error过滤器
        System.out.println(10/0);
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();
        String token = request.getParameter("token");
        System.out.println(token);

        if (null == token || !("123".equals(token))){
            //设置网关不放行
            context.setSendZuulResponse(false);
            context.setResponseStatusCode(401);
            context.addZuulRequestHeader("content-type","text/html:charset=utf-8");
            context.setResponseBody("request illegal");
        }else {
            System.out.println("请求合法");
        }
        return null;
    }
}
