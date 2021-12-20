package com.example.mybatis_demo_foreach.web;

import com.example.mybatis_demo_foreach.service.Service;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class Web {

    @Resource
    private Service service;

    @GetMapping("test")
    public void insertTest(){
        service.insertStudents();
    }
}
