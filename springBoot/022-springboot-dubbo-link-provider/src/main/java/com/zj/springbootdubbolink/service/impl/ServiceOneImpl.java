package com.zj.springbootdubbolink.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zj.springbootdubbolink.service.ServiceOne;


@org.springframework.stereotype.Service
@Service(interfaceClass = ServiceOne.class,version = "1.0")
public class ServiceOneImpl implements ServiceOne {
    @Override
    public String doTest() {
        return "zhoujian";
    }
}
