package com.zj;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class doDemo {
    @RequestMapping(value = "some.do")
    public ModelAndView doSome(){
        System.out.println("==============================");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("doLoading","Loading........!");
//        当配置视图解析器的话就可以直接使用文件的名字来,如下：
        modelAndView.setViewName("showTwo");

//        配置了视图解析器的话之前的默认路径就不奏效了
//        modelAndView.setViewName("/show.jsp");
        return modelAndView;
    }
}
