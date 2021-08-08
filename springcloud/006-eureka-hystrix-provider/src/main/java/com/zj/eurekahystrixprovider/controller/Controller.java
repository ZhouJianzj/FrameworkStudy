package com.zj.eurekahystrixprovider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhoujian
 */
@RestController
public class Controller {
    @RequestMapping("test")
    public String test(){
//        制造错误实现服务出现问题，出发服务消费者的熔断器工作
        System.out.println(10/0);
        return "服务的提供者";
    }
}
