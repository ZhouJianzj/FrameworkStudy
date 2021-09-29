package com.zj.springbootredis.web;

import com.zj.springbootredis.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zhoujian
 */
@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    private Service service;

    @RequestMapping("/put/{key}/{value}")
    public void controllerPut(@PathVariable("key") String key, @PathVariable("value") String value) {
        service.servicePut(key, value);
    }

    @RequestMapping("/get/{name}")
    @ResponseBody
    public String controllerGet(@PathVariable("name") String name) {
        return service.serviceGet(name);
    }
}
