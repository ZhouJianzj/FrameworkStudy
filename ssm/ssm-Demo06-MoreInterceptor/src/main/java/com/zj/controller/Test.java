package com.zj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Test {
    @RequestMapping("some.do")
    public ModelAndView doSome() {
        return new ModelAndView("show");
    }
}
