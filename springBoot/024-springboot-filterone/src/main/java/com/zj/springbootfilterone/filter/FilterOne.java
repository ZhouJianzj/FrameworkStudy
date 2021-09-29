package com.zj.springbootfilterone.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * 过滤器的注解
 */
@WebFilter(urlPatterns = "/test/*")
public class FilterOne implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("------------------进入过滤器------------------");
//        放行
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
