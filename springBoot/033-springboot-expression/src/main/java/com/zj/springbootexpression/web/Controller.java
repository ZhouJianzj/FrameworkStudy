package com.zj.springbootexpression.web;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@org.springframework.stereotype.Controller
public class Controller {
    @RequestMapping(value = "/methodOne")
    public String methodOne(Model model) {
        model.addAttribute("id", 1001);
        model.addAttribute("name", "zhoujian");
        return "message";
    }


    @RequestMapping(value = "/methodTwo")
    public String methodTwo(Model model, HttpServletRequest request) {
        model.addAttribute("id", request.getParameter("id"));
        model.addAttribute("name", request.getParameter("name"));
        return "exhibit";
    }

    /**
     * 使用restful风格
     *
     * @param model
     * @param id
     * @param name
     * @return
     */
    @RequestMapping(value = "/restful/{id}/{name}")
    public String restful(Model model,
                          @PathVariable("id") Integer id,
                          @PathVariable("name") String name) {
        model.addAttribute("id", id);
        model.addAttribute("name", name);
        return "restful";
    }

    /**
     * 这里的id name什么的可以自动的注进来，也可以通过HttpServletRequest获取
     *
     * @param id
     * @param name
     * @param request
     * @return
     */
    @RequestMapping(value = "/doSubmit")
    @ResponseBody
    public String doSubmit(Integer id, String name, HttpServletRequest request) {
        System.out.println(request.getParameter("id"));
        return id + ":" + name;
    }
}
