package com.zj.demospringcloudeurekafeginconsumer.server;


import com.zj.demospringcloudeurekafeginconsumer.model.User;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class HystrixFallbackMethod implements Server {
    @Override
    public String testServer() {
        return "+++++++++++++++";
    }

    @Override
    public String testParams(String name, Integer id) {
        return null;
    }

    @Override
    public String testObject(User user) {
        return null;
    }

    @Override
    public String testMap(Map<String, String> map) {
        return null;
    }

    @Override
    public User testReturnObject() {
        return null;
    }

    @Override
    public List testReturnList() {
        return null;
    }

}
