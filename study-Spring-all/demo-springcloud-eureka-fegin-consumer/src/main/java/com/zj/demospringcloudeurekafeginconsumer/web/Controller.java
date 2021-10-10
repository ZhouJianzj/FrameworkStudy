package com.zj.demospringcloudeurekafeginconsumer.web;


import com.zj.demospringcloudeurekafeginconsumer.model.User;
import com.zj.demospringcloudeurekafeginconsumer.server.Server;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.*;

@RestController
public class Controller {
    @Resource
    private Server server;

    @RequestMapping("test1")
    public String testController(){
        return "test----消费者-----" + server.testServer();
    }

    @RequestMapping("testParams")
    public String testParams(String name,Integer id){
        return "消费者------" + server.testParams(name, id);
    }

    @RequestMapping("testObject")
    public String testObject(){
        User user = new User("zhoujian",001);
        return "消费者-----"+ server.testObject(user);
    }

    @RequestMapping("testMap")
    public String testMap(){
        Map<String, String> stringStringHashMap = new HashMap<String, String>();
        stringStringHashMap.put("name","zhoujian");
        stringStringHashMap.put("id","001");
        return "消费者-----"+ server.testMap(stringStringHashMap);
    }


    @RequestMapping("testReturnObject")
    public User testReturnObject(){
        return server.testReturnObject();
    }

    @RequestMapping("testReturnList")
    public List testReturnList(){
        List<User> list = server.testReturnList();
        for (User user:list){
            System.out.println(user.toString());
        }

        System.out.println(list.get(1).getClass().getName() + "===========================");
        return list;
    }

}
