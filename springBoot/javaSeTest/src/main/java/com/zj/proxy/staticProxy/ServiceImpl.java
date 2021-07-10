package com.zj.proxy.staticProxy;

public class ServiceImpl implements Service {
    @Override
    public void doService() {
        System.out.println("serviceImpl   execute   !");
    }
}
