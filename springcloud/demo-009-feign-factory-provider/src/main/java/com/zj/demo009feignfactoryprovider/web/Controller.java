package com.zj.demo009feignfactoryprovider.web;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @RequestMapping("test")
    public String test(){
        System.out.println(10/0);
        return "provider";
    }
}
