package com.zj.web;
import com.zj.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class Controller {
    @Autowired
    private Service service;

    @Value(value = "${name}")
    private String name;

    @RequestMapping("test")
    public List testSelectDept(){
        System.out.println(name);
        return service.ctlSelectDept();
    }
}
