package com.zj.controller;


import com.zj.doMain.Student;
import com.zj.service.StudentService;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;


@Controller
public class StudentController {
    @Resource
    private StudentService studentService;
    @RequestMapping("studentAdd.do")
    public ModelAndView doAddStudent(Student student){
        ModelAndView modelAndView = new ModelAndView();
        int i = studentService.addStudent(student);
        if (i>=1){
            modelAndView.addObject("tips","注册成功！" + i);
        }else {
            modelAndView.addObject("tips","注册失败！");
        }
        modelAndView.setViewName("show");
        return modelAndView;
    }
    @RequestMapping("studentFind.do")
    @ResponseBody
    public List<Student> findStudent(){
        return studentService.findStudents();
    }
}
