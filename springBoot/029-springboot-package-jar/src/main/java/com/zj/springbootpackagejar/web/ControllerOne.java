package com.zj.springbootpackagejar.web;

import com.zj.springbootpackagejar.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerOne {
    @RequestMapping(value = "/test")
    public ModelAndView doTest() {
        ModelAndView modelAndView = new ModelAndView();

        User user = new User();
        user.setName("周健");
        user.setDesc("是一个有志青年！");

        modelAndView.addObject(user);
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @RequestMapping(value = "/testJsp")
    public String testJsp() {
        return "index";
    }
}
