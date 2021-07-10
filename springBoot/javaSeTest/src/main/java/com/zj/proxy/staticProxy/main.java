package com.zj.proxy.staticProxy;

public class main {
    public static void main(String[] args) {
        new StaticProxy(new ServiceImpl()).doService();
    }
}
