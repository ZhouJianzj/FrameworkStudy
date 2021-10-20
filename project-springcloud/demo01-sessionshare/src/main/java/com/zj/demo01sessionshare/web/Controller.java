package com.zj.demo01sessionshare.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class Controller {
    @Autowired
    private RedisTemplate redisTemplate;

    @RequestMapping("test")
    public Object test(){
        redisTemplate.opsForValue().set("name","zhoujian");
        Object o = redisTemplate.opsForValue().get("name");
        return o;
    }
    @RequestMapping("testSession")
    public String testSession(HttpSession session) {
        session.setAttribute("name", "zj");
        System.out.println(session.getClass().getName());
        return "ok";
    }
    @RequestMapping("testSession1")
    public String testSession1(HttpSession session) {
        return (String) session.getAttribute("name");
    }
}
