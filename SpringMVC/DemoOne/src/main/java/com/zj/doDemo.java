package com.zj;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class doDemo {
    @RequestMapping(value = "some.do")
    public ModelAndView doSome(){
        System.out.println("==============================");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("doLoading","Loading........!");
        modelAndView.setViewName("/show.jsp");
        return modelAndView;
    }
}
