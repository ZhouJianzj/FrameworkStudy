package com.zj.demo02loginadnregistyer.server;

import com.zj.demo02loginadnregistyer.dao.UserDao;
import com.zj.demo02loginadnregistyer.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.util.List;

@Component
public class UserServerImpl implements UserServer {
    @Autowired
    private UserDao userDao;

    @Override
    public User sLogin(User user) {


        return userDao.dLogin(user);
    }

    @Override
    public Boolean sRegist(User user) {
//        Integer类型的数据没有传值的时候为null，String类型没有传值的时候为 “”
        if (user.getUserName() == "" || user.getPassword() == null || user.getRealName() == "") {
            return false;
        } else {
            return userDao.dRegister(user);
        }
    }

    @Override
    public List<User> select() {
        return userDao.select();
    }

}
