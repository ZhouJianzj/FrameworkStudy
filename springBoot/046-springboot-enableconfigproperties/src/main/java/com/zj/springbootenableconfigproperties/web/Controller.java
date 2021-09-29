package com.zj.springbootenableconfigproperties.web;

import com.zj.Dog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    private Dog dog;

    @RequestMapping("/show")
    @ResponseBody
    public String show() {
        return dog.getName();
    }
}
