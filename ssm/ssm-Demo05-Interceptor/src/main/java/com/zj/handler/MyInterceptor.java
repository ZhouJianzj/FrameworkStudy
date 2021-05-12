package com.zj.handler;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

public class  MyInterceptor  implements HandlerInterceptor {
    private  long start;
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("请求之前执行，请求被拦截了，controller对象就不会执行！\n作用：实现拦截");
//        加一个时间戳
        start = System.currentTimeMillis();
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
       System.out.println("controller对象执行完成执行！\n作用：就是可以修改ModelAndView中的参数，决定最终的参数");
//       演示:数据增强
        assert modelAndView != null;
        modelAndView.addObject("date",new Date());
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("响应之后执行，也就是类似执行forward之后框架会默认执行这个方法，\n作用：就是为了销毁资源节省内存");
//        加时间戳
//        演示:整个请求执行完毕所用的时间
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
