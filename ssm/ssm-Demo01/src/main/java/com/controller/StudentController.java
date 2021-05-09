package com.controller;

import com.entities.Student;
import com.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentServiceImpl;
    @RequestMapping( "studentAdd")
    public ModelAndView doStudentAdd(String name,Integer age){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("num",studentServiceImpl.addStudent(new Student(name,age)));
        modelAndView.setViewName("show");
        return modelAndView;
    }
    @RequestMapping("studentFind")
    public ModelAndView doStudentFind(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("list",studentServiceImpl.findStudents());
        modelAndView.setViewName("showTwo");
        return modelAndView;
    }
}
