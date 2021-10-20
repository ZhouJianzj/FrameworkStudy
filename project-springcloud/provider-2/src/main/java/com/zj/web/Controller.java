package com.zj.web;


import com.zj.entities.Dept;
import com.zj.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private DeptService deptService;

    @RequestMapping("/dept")
    public List<Dept> ctlSelectDept(){
        System.out.println("1");
        return deptService.serSelectDept();
    }
}
