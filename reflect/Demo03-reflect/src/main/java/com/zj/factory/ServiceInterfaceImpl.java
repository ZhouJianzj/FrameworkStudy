package com.zj.factory;

import com.zj.service.ServiceInterface;

public class ServiceInterfaceImpl implements ServiceInterface {

    @Override
    public String doSome(String name) {

        return name;
    }
}
