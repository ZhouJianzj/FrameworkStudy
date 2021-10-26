package com.zj.web;


import com.zj.Service;
import com.zj.service.ServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    private ServiceInterface service;

    @RequestMapping("test")
    public String test(){
        return service.test();
    }
}
