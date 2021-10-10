package com.zj.eurekahystrixconsumer.controller;

import com.netflix.hystrix.HystrixCommand.Setter;
import com.netflix.hystrix.HystrixCommandGroupKey;
import com.netflix.hystrix.HystrixCommandGroupKey.Factory;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.zj.eurekahystrixconsumer.Hystrix.MyHystrix;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author zhoujian
 */
@RestController
public class Controller {
    @Resource
    private RestTemplate restTemplate;

    @RequestMapping("doTest")
    /**
     * 在这个控制器上开启熔断器，
     *      fallbackMethod：指的是当服务的提供者出现了问题之后调用的方法，
     */
    @HystrixCommand(fallbackMethod = "Exception")
    public String doTest(){
        String forObject = restTemplate.getForObject("http://006-eureka-hystrix-provider/test", String.class);
        return "使用hystrix熔断器的服务消费者------------" + forObject;
    }

    /**
     * 服务的降级方法，给用户返回一个本地的信息，来解决没有调用服务提示
     * @return
     */
    public String Exception(){
        return "熔断器熔断";
    }

    /**
     * 模拟网络延迟10m
      * @return
     */
     @RequestMapping("doTest01")
     @HystrixCommand(
             fallbackMethod = "timeOutMethod",
             commandProperties = {
//                  被调用的服务反应时间需要在2秒之内，不能等于
                     @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value="2000")
             },
             ignoreExceptions = {Exception.class}
     )
    public String doTest01(){
        String forObject = restTemplate.getForObject("http://006-eureka-hystrix-provider/test01", String.class);
        return "使用hystrix熔断器的服务消费者------------" + forObject;
    }
    public String timeOutMethod(){
         return "请求超时间";
    }

    @RequestMapping("doTest02")
    public String doTest02(){
        String url = "http://006-eureka-hystrix-provider/test02";
        MyHystrix myHystrix = new MyHystrix(com.netflix.hystrix.HystrixCommand.Setter
                .withGroupKey(HystrixCommandGroupKey.Factory.asKey(""))
                ,restTemplate,url);
//        当没有熔断的时候返回是url地址执行的返回值，当熔断的时候返回值就是我们从写的getFallback方法返回值了
        String execute = myHystrix.execute();
//        当熔断的时候会出现    自定义的熔断器----- ------------自定义熔断了服务--------，而不是像之前的熔断器值返回fallback方法的返回值
        return "自定义的熔断器-----"+ execute;
    }

}
