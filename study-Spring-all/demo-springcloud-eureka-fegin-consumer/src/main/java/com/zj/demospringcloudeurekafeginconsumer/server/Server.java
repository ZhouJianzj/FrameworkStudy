package com.zj.demospringcloudeurekafeginconsumer.server;


import com.zj.demospringcloudeurekafeginconsumer.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@FeignClient(value = "demo-springcloud-eureka-fegin-provider",
        fallback = HystrixFallbackMethod.class)
public interface Server {
    /**
     * 这里需要注意的是  这里的请求路径必须是需要和服务的提供者一样的
     *  演示的是发生了故障熔断
     * @return
     */
    @RequestMapping("test1")
    String testServer();

    /**
     * 演示的传递多个参数
     * @param name
     * @param id
     * @return
     */
    @RequestMapping("testParams")
    String testParams(@RequestParam(value = "name") String name ,@RequestParam(value = "id") Integer id);

    /**
     * 演示以对象的形式传递参数
     * @param user
     * @return
     */
    @RequestMapping("testObject")
    String testObject(@RequestBody User user);

    /**
     * 演示的是以map形式传递参数的
     * @param map
     * @return
     */
    @RequestMapping("testMap")
    String testMap(@RequestBody Map<String, String> map);


    /**
     * 演示的是返回对象类型的返回值
     * @return
     */
    @RequestMapping("testReturnObject")
    public User testReturnObject();

    /**
     * 演示的是返回集合的方式
     * @return
     */
    @RequestMapping("testReturnList")
    public List testReturnList();
}
