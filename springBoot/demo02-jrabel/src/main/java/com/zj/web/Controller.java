package com.zj.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhoujian
 */
@RestController
public class Controller {

    @GetMapping("testJrebel")
    public String testJrebel(){
        return "testJrebel";
    }
    @GetMapping("testJrebel1")
    public String testJrebel1(){
        return "testJrebel1";
    }

}
