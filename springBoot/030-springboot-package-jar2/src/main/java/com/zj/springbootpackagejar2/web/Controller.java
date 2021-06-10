package com.zj.springbootpackagejar2.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @RequestMapping(value = "/testOne")
    public String doTestOne(){
        return "testOne";
    }
}
