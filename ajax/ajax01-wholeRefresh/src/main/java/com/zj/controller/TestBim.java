package com.zj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class TestBim {
    @RequestMapping("textBim")
    public ModelAndView calculate(HttpServletRequest request, HttpServletResponse response) {
        Float height = Float.valueOf(request.getParameter("h"));
        Float weight = Float.valueOf(request.getParameter("w"));
        ModelAndView mv = new ModelAndView("show");
        mv.addObject("msg", "你当前的BMI为：" + (weight / (height * height)));
        return mv;
    }
}
