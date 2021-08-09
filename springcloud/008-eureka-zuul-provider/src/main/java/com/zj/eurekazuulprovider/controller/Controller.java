package com.zj.eurekazuulprovider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @RequestMapping("/test")
    public String test(){
        return "服务提供者";
    }

    @RequestMapping("/testTwo")
    public String testTwo(){
        return "服务提供者";
    }
}
