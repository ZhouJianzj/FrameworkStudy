package com.zj.demospringcloudeurekafeginprovider.web;


import com.zj.demospringcloudeurekafeginprovider.model.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class Controller {

    @RequestMapping("test1")
    public String test() {
        System.out.println(10 / 0);
        return "test1----服务提供者";
    }


    @RequestMapping("testParams")
    public String testParams(String name, Integer id) {
        return name + "---" + id;
    }

    @RequestMapping("testObject")
    public String testObject(@RequestBody User user) {
        return user.getName() + "---" + user.getId();

    }

    @RequestMapping("testMap")
    public String testMap(@RequestBody Map<String, String> map) {
        return map.get("name") + "---" + map.get("id");

    }

    @RequestMapping("testReturnObject")
    public User testReturnObject() {
        return new User("zhoujian", 1);
    }

    @RequestMapping("testReturnList")
    public List<User> testReturnList() {
        ArrayList<User> users = new ArrayList<User>();
        users.add(new User("zhoujian", 2));
        users.add(new User("zhoujian", 1));
        return users;
    }
}
