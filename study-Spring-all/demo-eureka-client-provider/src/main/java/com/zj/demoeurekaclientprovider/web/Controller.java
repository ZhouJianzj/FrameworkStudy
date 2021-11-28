package com.zj.demoeurekaclientprovider.web;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class Controller {


    @RequestMapping("testZuul")
    public String testZuul() {
        return "provider provided server.....";
    }
}
