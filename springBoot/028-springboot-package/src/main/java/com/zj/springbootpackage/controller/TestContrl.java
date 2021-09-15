package com.zj.springbootpackage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestContrl {
    @RequestMapping(value = "/test")
    public String test(){
        return "index";
    }
}
