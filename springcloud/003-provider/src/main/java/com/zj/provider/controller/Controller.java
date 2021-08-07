package com.zj.provider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhoujian
 */
@RestController
public class Controller {
    @RequestMapping("test")
    public String doTest(){
        return "eureka 集群下的服务提供者";
    }
}
