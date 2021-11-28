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
/**
 * 这里的@RequestParam(value = "id")也可以不写，地址栏中的"/findStu?id=1中的id也能对应到方法中的id传递过来，默认是按照名字来自动赋值的
 * 如果要是写了就必须有id这个属性传递 过来哪怕是没有值
 */
    public Student findStu(Integer id) {
        System.out.println(id);
        return studentService.selectStu(id);
    }

    @RequestMapping("addList")
    public void insertUserList() {
        studentService.insertService();
    }

}
