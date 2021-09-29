package com.zj.springbootfunction.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
public class controller {
    @RequestMapping(value = "/doFunction")
    public String doFunction(Model model) {
        model.addAttribute("date", new Date());
        return "Function";
    }
}
