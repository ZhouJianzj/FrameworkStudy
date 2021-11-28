package com.zj.eurekazuulprovider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @RequestMapping("/test")
    public String test(String token) {
        System.out.println(token);

        return "服务提供者";
    }

    @RequestMapping("/t")
    public String testTwo() {
        return "服务提供者";
    }
}
