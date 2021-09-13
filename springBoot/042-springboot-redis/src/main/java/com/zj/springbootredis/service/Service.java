package com.zj.springbootredis.service;

public interface Service {
    void servicePut(String key, String value);

    String serviceGet(String name);
}
