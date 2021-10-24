package com.zj.web;


import com.zj.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class Controller {

    @Resource
    private Service service;

    @RequestMapping("test")
    public String test(){
        return service.test();
    }
}
