package com.zj.advice;

import com.zj.annotation.IgnoreResponseAdvice;
import com.zj.dao.LogDao;
import com.zj.entities.CommonResponse;
import com.zj.entities.Log;
import com.zj.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.http.server.ServletServerHttpRequest;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;


@RestControllerAdvice
public class CommoAdvice implements ResponseBodyAdvice<Object> {
    @Resource
    private LogDao logDao;

    @Override
    public boolean supports(MethodParameter methodParameter, Class<? extends HttpMessageConverter<?>> aClass) {
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

    @Override
    public Object beforeBodyWrite(Object o,
                                  MethodParameter methodParameter,
                                  MediaType mediaType,
                                  Class<? extends HttpMessageConverter<?>> aClass,
                                  ServerHttpRequest serverHttpRequest,
                                  ServerHttpResponse serverHttpResponse) {




        ServletServerHttpRequest request = (ServletServerHttpRequest) serverHttpRequest;
        HttpServletRequest res = request.getServletRequest();
        HttpSession session = res.getSession(false);
        CommonResponse<Object> response = new CommonResponse<Object>(200,"没有登录！");
        //确认模块
        String module = verifyModule(res.getRequestURI());
        System.out.println("======================================================");
        System.out.println(module);
        System.out.println("======================================================");

      // 没有登录就返回直接返回
        if (null == session){
            response.setMsg("没有登录！");
            response.setStatus(400);
            return response;
        }

        //默认的响应对象
        if (null == o){
            //没有就执行响应一个初始的响应
            response.setMsg("响应为null");
            return  response;
        }else  {
            //如果是一个普通的数据对象，就传入统一响应对象中去
            response.setMsg("正常响应！");
            response.setData(o);
        }
        //获取用户username
        User user = (User) session.getAttribute("user");
        String username = user.getUsername();
        //数据库插入
        logDao.logInsert(new Log(username,res.getRequestURI(),module,new Date()));

        return response;
    }

    /**
     * 模块确认
     * @param requestURI
     * @return
     */
    String verifyModule(String requestURI ){
        //  /user/noLogin
        int end = requestURI.indexOf('/', 1);
        String substring = requestURI.substring(1, end);
        System.out.println(substring +"======================");
        String module = null;
        switch (substring){
            case "user" : module = "用户模块" ;
            break;
            case "other" : module = "别的模块";
            break;
        }
        return module;
    }



}
