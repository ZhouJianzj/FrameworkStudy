package com.zj.springbootdubbolinkclient.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zj.springbootdubbolink.service.ServiceOne;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControllerOne {
    @Reference(interfaceClass = ServiceOne.class,version = "1.0")
    private ServiceOne serviceOne;

    @RequestMapping(value = "/Test")
    public @ResponseBody String doTest(){
        return serviceOne.doTest();
    }
}
