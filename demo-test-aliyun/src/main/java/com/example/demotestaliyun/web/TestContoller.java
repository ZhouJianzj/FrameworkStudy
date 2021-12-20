package com.example.demotestaliyun.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhoujian
 */
@RestController
public class TestContoller {

    @GetMapping("test")
    public String test(){
        return "test";
    }
}
