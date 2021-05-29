package com.zj.controller;

import com.zj.entity.Student;
import com.zj.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class StudentController {
    @Resource
    private StudentService studentService;
    @RequestMapping(value = "findStu")
    public void findStu(Integer id){
        Student stu = studentService.findStu(id);
        System.out.println(stu.getId() + " " + stu.getName());
    }
}
