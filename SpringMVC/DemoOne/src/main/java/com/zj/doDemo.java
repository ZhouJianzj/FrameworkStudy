package com.zj;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class doDemo {
    /**
     * 配置需要处理请求的url
     *
     */
    @RequestMapping(value = "some.do")
    public ModelAndView doMain(){
        ModelAndView mv = new ModelAndView();
        //设置变量 key  和  value
        mv.addObject("do","正在执行Loading。。。。。。");
        mv.addObject("result","执行完毕！");
        //请求转发的url
        mv.setViewName("/show.jsp");
        return mv;
    }
}
