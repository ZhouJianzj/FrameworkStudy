package com.example.demo.web;

import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhoujian
 */
@RestController
public class Controller {

//    @Autowired
//    private User user;

    @RequestMapping("/hello")
    public String hello() {
        return "Hello World!";
    }



}
