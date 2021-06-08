package com.zj.springbootmybatistranscation.controller;

import com.zj.springbootmybatistranscation.model.Student;
import com.zj.springbootmybatistranscation.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StuController {
    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "updateStu")
    @ResponseBody
    public int updateStu(Integer age, Integer id){
        Student student = new Student();
        student.setAge(age);
        student.setId(id);
        return studentService.updateStu(student);
    }
}
