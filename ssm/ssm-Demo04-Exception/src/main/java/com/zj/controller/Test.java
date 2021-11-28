package com.zj.controller;

import com.zj.exception.AgeException;
import com.zj.exception.MyException;
import com.zj.exception.NameException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Test {
    @RequestMapping("somedo.do")
    public ModelAndView doForward(String name, Integer age) throws MyException {
        ModelAndView modelAndView = new ModelAndView();
//        当第一个抛出异常的时候就不会在执行下面的程序了，
//        还需注意的是方法中throw子类的时候，方法上直接throws父类
        if (!("zj".equals(name))) {
            throw new NameException("姓名不是zj");
        }
        if (null == age || age >= 30) {
            throw new AgeException("年龄大于30 或则 年龄为null");
        }
        modelAndView.addObject("name", name);
        modelAndView.addObject("age", age);
        modelAndView.setViewName("show");
        return modelAndView;
    }
}
