package com.zj.providerparam.controller;

import com.zj.providerparam.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhoujian
 */
@RestController
public class Controller {
    @RequestMapping("doList")
    public String doList(User user){

        return  "" + user;
    }
    @RequestMapping("doMap")
    public String doMap(User user){
        return user.toString();
    }
    @RequestMapping("doReturn")
    public User doReturn(User user){
        return   user;
    }
    @RequestMapping("doReturnGetForObject")
    public User doReturnGetForObject(User user){
        return user;
    }
    @RequestMapping("doPostForEntity")
    public User doPostForEntity(User user){
        return user;
    }
    @RequestMapping("doPut")
    public User doPut(User user){
        System.out.println(user.toString());
        return user;
    }
    @RequestMapping("doDelete")
    public User doDelete(User user){
        System.out.println(user.toString());
        return user;
    }
}
