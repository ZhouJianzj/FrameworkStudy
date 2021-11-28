package com.zj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Test {
    @RequestMapping("doForward.do")
    public ModelAndView doForward(String name, Integer age) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name", name);
        modelAndView.addObject("age", age);
//        注意：这里的forward和视图解析器是不同时工作的，所以需要书写全限定名称
        modelAndView.setViewName("forward:/WEB-INF/jsp/show.jsp");
        return modelAndView;
    }

    @RequestMapping("doRedirect.do")
    public ModelAndView doRedirect(String name, Integer age) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("name", name);
        mv.addObject("age", age);
//        重定向是不可以访问服务器内部的资源的，也必须是全限定名称，会像下面一样传递参数，会改变第一次传递来的参数
//        http://localhost:8080/ssm_Demo03_Forward_Redirect/ShowTwo.jsp?myName=zhoujian&myAge=23
        mv.setViewName("redirect:/ShowTwo.jsp");
        return mv;
    }
}
