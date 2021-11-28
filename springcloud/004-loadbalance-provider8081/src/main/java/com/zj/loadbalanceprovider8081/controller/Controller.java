package com.zj.loadbalanceprovider8081.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @RequestMapping("test")
    public String test() {
        return "8081服务";
    }
}
