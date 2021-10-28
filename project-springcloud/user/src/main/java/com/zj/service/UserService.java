package com.zj.service;
import com.zj.entities.User;
import javax.servlet.http.HttpServletRequest;

public interface UserService {
    User PSDoLogin(User user, HttpServletRequest request);

    boolean PSDoInsert(User user);

    boolean PSDoDelete(int id);
}

