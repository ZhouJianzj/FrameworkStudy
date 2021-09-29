package com.zj.springbootmybatismapperscan.controller;

import com.zj.springbootmybatismapperscan.model.Student;
import com.zj.springbootmybatismapperscan.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StuContr {
    @Autowired
    private StuService stuService;

    @RequestMapping(value = "/findStu")
    @ResponseBody
    public Student findStu(Integer id) {
        return stuService.selectStu(id);
    }
}
