package com.zj.springbootsplice.web;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {
    @RequestMapping(value = "splice")
    public String doSplice(Model model){
        model.addAttribute("countPage",123);
        model.addAttribute("currentPage",2);
        model.addAttribute("page",12);
        return "Splice";
    }
}
