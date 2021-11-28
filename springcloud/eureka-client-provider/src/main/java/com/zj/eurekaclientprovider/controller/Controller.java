package com.zj.eurekaclientprovider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhoujian
 */
@RestController
public class Controller {
    @RequestMapping("test")
    public String doTest() {
        return "这是一个使用eureka注册中心的服务提供者";
    }
}
