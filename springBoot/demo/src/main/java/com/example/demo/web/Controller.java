package com.example.demo.web;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {
    @RequestMapping("test")

    public String test(Model model){
        model.addAttribute("da","hello zhoujian");
        return "show";
    }
}
