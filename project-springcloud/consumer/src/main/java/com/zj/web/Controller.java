package com.zj.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("test")
    public List testSelectDept(){
        return restTemplate.getForObject("http://provider/dept", List.class);
    }
}
