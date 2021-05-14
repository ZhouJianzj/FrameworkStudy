package com.zj.controller;

import com.zj.entities.Student;
import com.zj.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
public class StudentController {
    @Resource
    private StudentService studentService;
    @RequestMapping("findStudent")
    @ResponseBody
    public Student doAjax(HttpServletResponse response, HttpServletRequest request) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Student student = studentService.findStudent(id);

        return student;
//        response.setContentType("text/html");
//        PrintWriter writer = response.getWriter();
//        writer.print(student.getName());
//        writer.print(student.getAge());
//        writer.flush();
//        writer.close();
    }
}
