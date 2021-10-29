package com.example.demo1other.web;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author zhoujian
 */
@RestController
@RequestMapping("other")
public class Controller {

    @RequestMapping("test")
    public String test(HttpServletRequest request){
        HttpSession session = request.getSession(false);
        if (null != session){
            System.out.println(session.getAttribute("user") + "===================获取user");
        }
        return "测试gateway成功！";
    }
}
