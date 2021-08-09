package com.zj.eurekaprovider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @RequestMapping("one")
    public String one(){
        return "provider  execute one";
    }
}
