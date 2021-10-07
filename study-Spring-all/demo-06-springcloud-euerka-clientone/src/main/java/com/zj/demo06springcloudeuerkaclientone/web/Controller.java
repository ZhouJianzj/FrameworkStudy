package com.zj.demo06springcloudeuerkaclientone.web;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping("test")
    public String test(){
        return "eureka client one";
    }
}
