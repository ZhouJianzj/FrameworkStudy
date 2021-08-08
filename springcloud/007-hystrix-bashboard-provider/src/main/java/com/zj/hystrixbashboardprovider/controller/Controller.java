package com.zj.hystrixbashboardprovider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhoujian
 */
@RestController
public class Controller {
    @RequestMapping("doTest")
    public String doTest(){
        return "服务的提供者";
    }
}
