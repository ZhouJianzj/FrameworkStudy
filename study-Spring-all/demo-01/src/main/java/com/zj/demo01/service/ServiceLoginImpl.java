package com.zj.demo01.service;

import com.zj.demo01.dao.DaoLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ServiceLoginImpl implements ServiceLogin {
    @Autowired
    private DaoLogin daoLogin;

    @Override
    public boolean checkLogin(String psd, String name) {
        String select = daoLogin.select(psd, name);
        System.out.println("==================================" + select);

        if ("1".equals(select)) {
            return true;
        } else {
            return false;
        }
    }
}
