package com.zj.springbootdubbossmconsumer.web;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import service.ServiceAll;

@org.springframework.stereotype.Controller
public class Controller {

    /**
     * 使用注册中心 注入服务
     */
    @Reference(interfaceClass = ServiceAll.class,version = "1.0",check = false)
    private ServiceAll serviceAll;

    /**
     * 测试mybatis
     * @param id
     * @return
     */
    @RequestMapping("/ctrCS/{id}")
    public ModelAndView CtrChengShi(@PathVariable("id")Integer id){
        ModelAndView mv = new ModelAndView();
        String s = serviceAll.mybaitsChengShi(id);
        mv.addObject("msg",s);
        mv.setViewName("mybatis");
        return mv;
    }

    /**
     * 测试reids
     * @param name
     * @return
     */
    @RequestMapping("/ctrName/{name}")
    public ModelAndView ctrName(@PathVariable("name")String name){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg",serviceAll.redisName(name));
        modelAndView.setViewName("redis");
        return modelAndView;
    }
}
