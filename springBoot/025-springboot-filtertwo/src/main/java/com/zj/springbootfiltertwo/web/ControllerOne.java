package com.zj.springbootfiltertwo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerOne {

    @RequestMapping(value = "/test/a/b")
    public String test(){
        return "test";
    }

    @RequestMapping(value = "/out")
    public String out(){
        return "out";
    }
}
