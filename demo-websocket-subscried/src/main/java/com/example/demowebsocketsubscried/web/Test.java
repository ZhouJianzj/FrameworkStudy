package com.example.demowebsocketsubscried.web;


import com.example.demowebsocketsubscried.service.TaskService;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author zhoujian
 */
@RestController
public class Test {

    @Resource
    TaskService taskService;

    public void testAAA(){

    }

}
