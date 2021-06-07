package com.zj.springbootintegrationjsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author zhoujian
 */
@Controller
public class SayHelloController {
    @RequestMapping(value = "/sayHello")
    public ModelAndView sayHello(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("message","Hello Springboot");
        mv.setViewName("say");
        return mv;
    }
    @RequestMapping(value = "/test")
    public @ResponseBody String doTest(){
        return "=====================";
    }
}
