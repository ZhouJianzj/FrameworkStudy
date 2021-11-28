package com.zj.springbootnginxserver02.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping("show")
    public ModelAndView show(HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView("show");
        return modelAndView.addObject("port", request.getServerPort());
    }
}
