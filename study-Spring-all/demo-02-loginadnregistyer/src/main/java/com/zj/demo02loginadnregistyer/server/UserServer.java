package com.zj.demo02loginadnregistyer.server;

import com.zj.demo02loginadnregistyer.model.User;

import java.sql.ResultSet;
import java.util.List;

public interface UserServer {
    User sLogin(User user);
    Boolean sRegist(User user);
    List<User> select();
}
