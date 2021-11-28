package com.zj.providerparam.controller;

import com.zj.providerparam.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhoujian
 */
@RestController
public class Controller {
    @RequestMapping(value = "doList")
    public List<User> doList() {
        List<User> users = new ArrayList<User>();
        User user1 = new User(001, "zhoujian", 12);
        User user2 = new User(002, "zhanhua", 23);
        User user3 = new User(003, "lihua", 12);
        users.add(user1);
        users.add(user2);
        users.add(user3);
        return users;
    }

    /**
     * 传递的参数类型是数组类型的
     *
     * @param user
     * @return
     */
    @RequestMapping("doArray")
    public User doList(User user) {
        return user;
    }

    @RequestMapping("doMap")
    public String doMap(User user) {
        return user.toString();
    }

    @RequestMapping("doReturn")
    public User doReturn(User user) {
        return user;
    }

    @RequestMapping("doReturnGetForObject")
    public User doReturnGetForObject(User user) {
        return user;
    }

    @RequestMapping("doPostForEntity")
    public User doPostForEntity(User user) {
        return user;
    }

    @RequestMapping("doPut")
    public User doPut(User user) {
        System.out.println(user.toString());
        return user;
    }

    @RequestMapping("doDelete")
    public User doDelete(User user) {
        System.out.println(user.toString());
        return user;
    }
}
