package com.zj.dubbospringbootclient.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zj.service.ServiceGet;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zhoujian
 */
@org.springframework.stereotype.Controller
public class Controller {
    @Reference(interfaceClass = ServiceGet.class,version = "1.0.0",check = false)
    private ServiceGet serviceGet;

    @RequestMapping("/get")
    @ResponseBody
    public Integer controllerGet(){
        return serviceGet.doGet();
    }
}
