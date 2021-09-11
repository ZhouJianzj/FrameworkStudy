package com.zj.demo01.controller;


import com.zj.demo01.service.ServiceLoginImpl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @author zhoujian
 */
@Controller
public class ControllerLogin {
    @Resource
    private ServiceLoginImpl serviceLogin;
    /**
     * 展示页面
     * @return
     */
    @RequestMapping(value = "/show")
    public String show(){
        return "login.html";
    };

    /**
     * 获取传递来的数据
     * @param username
     * @param password
     * @return
     */
    @RequestMapping("/login")
    public String doLogin(String username,String password){
        System.out.println(username + "===>" + password);
        boolean b = serviceLogin.checkLogin(password, username);
        if (b){
            return "redirect:/success.html";
        }else {
            return "redirect:/error.html";
        }
    }
}
