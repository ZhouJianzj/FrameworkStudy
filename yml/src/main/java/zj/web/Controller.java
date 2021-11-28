package zj.web;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    @GetMapping("/")
    public String test() {
        return "test";
    }


    @GetMapping("testSentinel")
    public String testSentinel() {
        return "sentinel测试成功！";
    }

    @GetMapping("testHystrix")
    @HystrixCommand(fallbackMethod = "fallbackMethod")
    public String testHystrix() {
        System.out.println(10 / 0);
        return "hystrix测试成功！";
    }


    public String fallbackMethod() {
        return "服务熔断了";
    }
}
