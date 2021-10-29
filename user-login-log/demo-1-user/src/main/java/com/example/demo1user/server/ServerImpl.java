package com.example.demo1user.server;

import com.example.demo1user.dao.Dao;
import org.springframework.stereotype.Service;
import zj.entity.User;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Service
public class ServerImpl implements Server {
    @Resource
    private Dao dao;

    @Override
    public User userLoginServer(User user, HttpServletRequest request) {
        User u = dao.UserLoginDao(user);
        //没有session
        if (null == request.getSession(false)){
            HttpSession session = request.getSession();
            //查询到用户了就存放到session中，这里的session的存放到redis中的
            if (null != u ){
                session.setAttribute("user",u);
            }
        }
        return   dao.UserLoginDao(user);
    }
}
