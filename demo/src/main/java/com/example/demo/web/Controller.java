package com.example.demo.web;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhoujian
 */
@RestController
public class Controller {

//    @Autowired
//    private User user;

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/hello")
    public String hello() {
        return "Hello World!";
    }



    @PostMapping("/user")
    public User insertUser(User user){
        userMapper.insertUser(user);
        return user;

    }



}
