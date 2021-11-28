package com.zj.demo14springcloudrestfourmethodprovid.web;


import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @GetMapping("doGetForEntity")
    public String doGetForEntity() {
        return "doGetForEntity方法";
    }

    @PostMapping("doPostForEntity")
    public String doPostForEntity(String name) {
        return "doPostForEntity方法 ----" + name;
    }

    @PutMapping("doPut")
    public String doPut(String name) {
        System.out.println("doPut方法 ----" + name);
        return "doPut方法 ----" + name;
    }

    @DeleteMapping("doDelete")
    public String doDelete() {
        System.out.println("doDelete方法");
        return "doDelete方法";
    }
}
