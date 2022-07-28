package com.zj.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

    @GetMapping("/test")
    public String testRemoteDebug(){
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        return "testRemoteDebug";
    }
}
