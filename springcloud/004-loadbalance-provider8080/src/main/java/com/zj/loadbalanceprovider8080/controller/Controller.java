package com.zj.loadbalanceprovider8080.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @RequestMapping("test")
    public String test() {
        return "8080服务";
    }
}
