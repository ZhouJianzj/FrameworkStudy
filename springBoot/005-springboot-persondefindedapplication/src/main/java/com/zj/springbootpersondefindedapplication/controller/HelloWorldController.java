package com.zj.springbootpersondefindedapplication.controller;

import com.zj.springbootpersondefindedapplication.entity.School;
import com.zj.springbootpersondefindedapplication.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zhoujian
 */
@Controller
public class HelloWorldController {
    /**
     * 就收application主配置文件中的自定的参数
     */
    @Value("${school.name}")
    private String schoolName;
    @Value("${school.address}")
    private String address;
    @RequestMapping(value = "/sayHello")
    public @ResponseBody
    String sayHello() {
        return schoolName + ":" + address;
    }

    /**
     * 从主配置文件中以对象的方式获取自定的参数
     */
    @Autowired
    private School school;
    @RequestMapping(value = "/sayFromObjectSchool")
    public @ResponseBody String sayFromObject(){
        return school.getName() + ":" + school.getAddress();
    }


    @Autowired
    private Student student;
    @RequestMapping(value = "/sayFromObjectStudent")
    public @ResponseBody String sayFromObjectStudent(){
        return student.getName() + ":" + student.getAge();
    }

}
