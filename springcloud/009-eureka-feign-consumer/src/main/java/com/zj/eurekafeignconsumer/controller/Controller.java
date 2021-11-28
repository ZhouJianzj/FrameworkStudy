package com.zj.eurekafeignconsumer.controller;

import com.zj.eurekafeignconsumer.entity.User;
import com.zj.eurekafeignconsumer.server.Server;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zhoujian
 */
@RestController
public class Controller {
    @Resource
    private Server server;

    /**
     * @return 演示声明式服务调用
     */
    @RequestMapping("/doTest")
    public String doTest() {

        String s = server.testFeign();
        return "使用feign的服务消费者8081--------" + s;
    }

    /**
     * 演示的是简单类型的参数传递
     *
     * @return
     */
    @RequestMapping("/doTestParam")
    public String doTestParam() {
        String param = server.testFeignParam("zhoujian");
        return "使用feign的服务消费者8081--------" + param;
    }

    /**
     * 演示的是对象类型的参数传递
     *
     * @return
     */
    @RequestMapping("/doTestParamObject")
    public String doTestParamObject() {
        String zhoujian = server.testFeignParamObject(new User("zhoujian", 22));
        return zhoujian;
    }

    /**
     * 演示的是对象类型的返回值
     *
     * @return
     */
    @RequestMapping("/doTestReturnObject")
    public String doTestReturnObject() {
        User user = server.testReturnUser();
        return user.getName();
    }

    /**
     * 演示的是list类型的返回值
     *
     * @return
     */
    @RequestMapping("/doTestReturnList")
    public String doTestReturnList() {
        List<User> users = server.testReturnList();
        return users.toString();
    }


}
