package com.zj.springbootobject.web;

import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@org.springframework.stereotype.Controller
public class Controller {
    @RequestMapping(value = "/object")
    public String doObject(HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.setAttribute("data", "zhoujian");
        return "Object";
    }
}
