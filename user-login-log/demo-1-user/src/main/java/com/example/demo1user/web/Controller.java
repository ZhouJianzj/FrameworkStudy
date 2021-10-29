package com.example.demo1user.web;


import com.example.demo1user.server.Server;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zj.entity.Data;
import zj.entity.User;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @author zhoujian
 */
@RestController
@RequestMapping("user")
public class Controller {
    @Resource
    private Server server;

    @RequestMapping("test")
    public Data test(){
        return new Data("zhoujian","yangzhou");
    }

    @PostMapping("login")
    public User userLogin(@RequestBody User user, HttpServletRequest request){
        return server.userLoginServer(user,request);
    }
}
