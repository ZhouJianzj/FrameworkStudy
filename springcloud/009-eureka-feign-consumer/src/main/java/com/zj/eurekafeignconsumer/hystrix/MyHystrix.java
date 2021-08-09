package com.zj.eurekafeignconsumer.hystrix;

import com.zj.eurekafeignconsumer.entity.User;
import com.zj.eurekafeignconsumer.server.Server;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class MyHystrix implements Server {
    @Override
    public String testFeign() {
        return "熔断器熔断了";
    }

    @Override
    public String testFeignParam(String name) {
        return null;
    }

    @Override
    public String testFeignParamObject(User user) {
        return null;
    }

    @Override
    public User testReturnUser() {
        return null;
    }

    @Override
    public List<User> testReturnList() {
        return null;
    }
}
