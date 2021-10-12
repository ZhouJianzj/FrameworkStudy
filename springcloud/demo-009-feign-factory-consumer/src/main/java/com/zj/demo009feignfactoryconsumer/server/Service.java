package com.zj.demo009feignfactoryconsumer.server;



import com.zj.demo009feignfactoryconsumer.hystrix.MyHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * 使用这个fallbackfactoru属性的时候熔断器可以获取到异常信息
 */
@FeignClient(value = "demo-009-feign-factory-provider",fallbackFactory = MyHystrix.class)
public interface Service {

    @RequestMapping("test")
    String serviceTest();
}
