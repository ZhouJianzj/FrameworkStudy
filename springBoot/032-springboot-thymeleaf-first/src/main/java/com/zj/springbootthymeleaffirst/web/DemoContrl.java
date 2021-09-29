package com.zj.springbootthymeleaffirst.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoContrl {
    @RequestMapping(value = "/test")
    public String test(Model model) {
        model.addAttribute("data", "springboot使用thymeleaf");
        return "message";
    }
}
