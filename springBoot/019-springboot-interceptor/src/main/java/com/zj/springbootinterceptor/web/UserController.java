package com.zj.springbootinterceptor.web;

import com.zj.springbootinterceptor.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value = "/user/login")
public class UserController {
    /**
     * 有登录
     * @param username
     * @param password
     * @param request
     * @return
     */
    @GetMapping(value = "/detail/{username}/{password}")
    public @ResponseBody
    User login(@PathVariable("username") String username,@PathVariable("password") Integer password, HttpServletRequest request){
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        request.getSession().setAttribute("user",user);
        return user;
    }

    /**
     * 没有登录
     * @return
     */
    @GetMapping(value = "/noLogin")
    @ResponseBody
    public String noLogin(){
        return "No Login";
    }

    /**
     * 没有登录之后报错
     * @return
     */
    @RequestMapping(value = "/Error")
    @ResponseBody
    public String messageError(){
        return "Error";
    }

    /**
     * 设置这个地址不要登录不拦截
     * @return
     */
    @RequestMapping(value = "/out")
    @ResponseBody
    public String out(){
        return "exclude path ";
    }
}
