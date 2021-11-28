package com.zj.demo009feignfactoryconsumer.web;


import com.zj.demo009feignfactoryconsumer.server.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class Contoller {
    @Resource
    private Service service;

    @RequestMapping("test")
    public String test() {
        return "consumer---" + service.serviceTest();
    }
}

