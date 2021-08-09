package com.zj.eurekafeignprovider.controller;

import com.zj.eurekafeignprovider.entity.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhoujian
 */
@RestController
public class Controller {
    @RequestMapping("/testFeign")
    public String testFeign(){
        System.out.println(10/0);
        return "服务的提供者8081";
    }

    @RequestMapping("/testFeignParam")
    public String testFeignParam(String name){
        return "服务的提供者8081--" + name  ;
    }

    @RequestMapping("/testFeignParamObject")
    public String testFeignParamObject(@RequestBody User user){
        return "服务的提供者8081--" + user.getName() + "--" + user.getAge()  ;
    }
    @RequestMapping("/testReturnObject")
    public User testReturnObject(){
        User user = new User("zhoujian",22);
        return user;
    }

    @RequestMapping("/testReturnList")
    public List<User> testReturnList(){
        User user1 = new User("zhoujian1",21);
        User user2 = new User("zhoujian2",22);
        User user3 = new User("zhoujian3",23);
        ArrayList<User> users = new ArrayList<>();
        users.add(user3);
        users.add(user2);
        users.add(user1);
        return users;
    }
}
