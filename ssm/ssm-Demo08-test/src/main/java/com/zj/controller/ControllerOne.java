package com.zj.controller;

import com.zj.eneties.Stu;
import com.zj.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author zhoujian
 */
@Controller
public class ControllerOne {
    @Autowired
    private StuService stuService;

    @RequestMapping(value = "/find")
    public void find(int id) {
        List<Stu> list = stuService.serviceFind(id);
        for (Stu l : list) {
            System.out.println(l.toString());
        }
    }
}
