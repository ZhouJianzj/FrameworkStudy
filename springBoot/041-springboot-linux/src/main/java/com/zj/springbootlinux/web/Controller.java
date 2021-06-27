package com.zj.springbootlinux.web;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {
    @RequestMapping(value = "zj")
    public String test(Model model){
        model.addAttribute("data","hello world");
        return "show";

    }
}
