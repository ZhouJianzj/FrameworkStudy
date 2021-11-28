package com.zj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
public class TestBim {
    @RequestMapping("textBim")
    public void calculate(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Float h = Float.valueOf(request.getParameter("h"));
        Float w = Float.valueOf(request.getParameter("w"));

        response.setContentType("text/html; charset=UTF-8");
        PrintWriter writer = response.getWriter();
        writer.print(w / (h * h));
        writer.flush();
        writer.close();
    }
}
