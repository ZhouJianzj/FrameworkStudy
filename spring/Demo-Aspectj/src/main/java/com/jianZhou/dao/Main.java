package com.jianZhou.dao;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        DaoImpl dao = new DaoImpl();
        MyProxy myProxy = new MyProxy(dao);
        Dao o = (Dao) Proxy.newProxyInstance(dao.getClass().getClassLoader(), dao.getClass().getInterfaces(), myProxy);
        o.doDO();
    }
}
