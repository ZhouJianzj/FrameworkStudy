package com.zj.web;


import com.zj.annotation.IgnoreResponseAdvice;
import com.zj.entities.Data;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/other")
public class Controller {

    @RequestMapping("/test")
//    @IgnoreResponseAdvice
    public Data test(){
        return new Data("zhoujian","yangzhou");
    }
}
