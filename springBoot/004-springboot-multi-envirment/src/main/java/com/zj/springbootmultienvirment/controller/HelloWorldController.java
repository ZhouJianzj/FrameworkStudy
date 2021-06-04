package com.zj.springbootmultienvirment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zhoujian
 */
@Controller
public class HelloWorldController {
    @RequestMapping(value = "/sayHello")
    public @ResponseBody
    String sayHello() {
        return "hello springBoot";
    }
}
