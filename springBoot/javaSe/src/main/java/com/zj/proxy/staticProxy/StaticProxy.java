package com.zj.proxy.staticProxy;

public class StaticProxy implements Service {
    private Service service;

    public StaticProxy() {
    }

    public StaticProxy(Service service) {
        this.service = service;
    }

    public void doService() {
        service.doService();
    }
}
