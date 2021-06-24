package com.zj.controller;


import com.zj.model.Student;
import com.zj.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class StudentContro {
    @Resource
    private StudentService stuSer;
    @RequestMapping(value = "findStu")
    public void findStu(){
        Student stu = stuSer.findStu(1001, "周健");
        System.out.println(stu.getId() +  " " + stu.getName());
    }
}
