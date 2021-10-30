package com.zj.advice;

import com.zj.annotation.IgnoreResponseAdvice;
import com.zj.dao.LogDao;
import com.zj.entities.CommonResponse;
import com.zj.entities.Log;
import com.zj.entities.User;
import org.springframework.core.MethodParameter;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.http.server.ServletServerHttpRequest;
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
    public Object beforeBodyWrite(Object body,
                                  MethodParameter methodParameter,
                                  MediaType mediaType,
                                  Class<? extends HttpMessageConverter<?>> aClass,
                                  ServerHttpRequest serverHttpRequest,
                                  ServerHttpResponse serverHttpResponse) {




        System.out.println("========================已经进入advice");
        ServletServerHttpRequest request = (ServletServerHttpRequest) serverHttpRequest;
        HttpServletRequest res = request.getServletRequest();
        //获取登录之后的共享用户对象的名字，（redis session 实现）
        HttpSession session = res.getSession(false);
        String username = "";
        if (session != null){
            User user = (User) session.getAttribute("user");
            username =user.getUsername();
        }
        String requestURI = res.getRequestURI();
        String method = res.getMethod();
        String module = verifyModule(requestURI);

        //日志
        logDao.logInsert(new Log(username,requestURI,module,new Date(),method));
        //设置统一响应体
        CommonResponse<Object> o = new CommonResponse<Object>(200,method,body);

//        ResponseEntity<Object> objectResponseEntity = new ResponseEntity<Object>(body,HttpStatus.ACCEPTED);
//        return objectResponseEntity;
        return o;
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
