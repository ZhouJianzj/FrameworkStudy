package com.zj.controller;

import com.zj.entity.Student;
import com.zj.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "findStu")
    public void findStu(Integer id) {
        Student stu = studentService.findStu(id);
        System.out.println(stu.getId() + " " + stu.getName());
//        实验的时候会出现404错误，是应为没有配置跳转的页面，看控制台就有数据了
    }
}
