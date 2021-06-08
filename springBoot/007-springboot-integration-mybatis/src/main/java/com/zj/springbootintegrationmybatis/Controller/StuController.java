package com.zj.springbootintegrationmybatis.Controller;

import com.zj.springbootintegrationmybatis.model.Student;
import com.zj.springbootintegrationmybatis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StuController {
    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/findStu")
    @ResponseBody
    public Student findStu(){
        return studentService.selectStu(1);
    }
}
