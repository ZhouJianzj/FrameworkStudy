package com.zj.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "Gateway")
public interface ServiceInterface {

    @RequestMapping("test")
    public String test();
}
