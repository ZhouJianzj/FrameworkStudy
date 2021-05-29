package com.zj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class test {
    @RequestMapping(value = "test")
    public void doTest(){
        System.out.println("====================");
    }
}
