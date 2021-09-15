package com.zj.springbootlogforjavaback.web;

import com.zj.springbootlogforjavaback.service.StuService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
public class StudentContrl {
    @Autowired
    private StuService stuService;
    @RequestMapping(value = "/findStu")
    public Integer findStudents(){
//        root的等级为debug则低于它的则不会打印
        log.trace("++++++++++++");
        log.info("查询学生数量");
        log.error("++++++");
        return  stuService.findStu();
    }
}
