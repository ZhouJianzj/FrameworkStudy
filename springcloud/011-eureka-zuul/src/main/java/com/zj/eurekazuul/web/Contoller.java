package com.zj.eurekazuul.web;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Contoller {

    @RequestMapping("gate")
    public String gateway() {
        return "网关的控制器";
    }
}
