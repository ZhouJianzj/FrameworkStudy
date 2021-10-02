package com.zj.vueshopadmin.web;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @PostMapping("/login")
    public boolean login(){
        return true;
    }
}
