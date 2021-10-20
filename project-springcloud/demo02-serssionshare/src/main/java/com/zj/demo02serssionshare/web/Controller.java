package com.zj.demo02serssionshare.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@RestController
public class Controller {
    @Autowired
    private RedisTemplate redisTemplate;

    @RequestMapping("testSession")
    public String testSession(HttpSession session) {
        System.out.println(session.getClass().getName());
        return (String) session.getAttribute("name");

    }
}
