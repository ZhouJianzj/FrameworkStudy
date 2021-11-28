package com.zj.controller;

import com.zj.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class Test {
    private StudentService studentService;


    @RequestMapping(value = "/test")
    public void doTest() {
        System.out.println(studentService.findStu(1001).getName());
        System.out.println(studentService.findStuNum());
    }
}
