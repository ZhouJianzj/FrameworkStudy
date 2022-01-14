package com.zj.springbootdocker.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhoujian
 */
@RestController
public class HelloController {

    @GetMapping("/test")
    public String hello(){
        return "hello zhoujian!";
    }

}
