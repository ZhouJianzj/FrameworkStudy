package com.zj.eurekafeignconsumer.server;


import com.zj.eurekafeignconsumer.entity.User;
import com.zj.eurekafeignconsumer.hystrix.MyHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author zhoujian
 * @FeignClient("009-EUREKA-FEIGN-PROVIDER") 里面的值对应的是服务的提供者的name
 * @RequestMapping("/doTest") 对应的是服务提供者具体的哪一个控制器
 */

@FeignClient(value = "009-EUREKA-FEIGN-PROVIDER", fallback = MyHystrix.class)
public interface Server {
    /**
     * 演示使用声明式的服务，就是接受服务提供者的控制器，当自己的控制器调用的时候就像调用自己的server方法一样
     *
     * @return
     */
    @RequestMapping("/testFeign")
    String testFeign();

    /**
     * 演示声明式服务的简单类型的参数传递,
     * 巨坑的是这里必须指定这里的注解的value为服务提供者与之对应的参数name
     *
     * @param name
     * @return
     */
    @RequestMapping("/testFeignParam")
    String testFeignParam(@RequestParam(value = "name") String name);

    /**
     * 演示对象类型的参数的传递，提供者和消费者之间都需要使用@RequestBody
     *
     * @param user
     * @return
     */
    @RequestMapping("/testFeignParamObject")
    String testFeignParamObject(@RequestBody User user);

    /**
     * 演示的是返回值类型为对象的类型
     *
     * @return
     */
    @RequestMapping("/testReturnObject")
    User testReturnUser();

    @RequestMapping("/testReturnList")
    List<User> testReturnList();
}
