package com.zj.service;

import com.zj.dao.UserDao;
import com.zj.entities.User;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    @Override
    public User PSDoLogin(User user, HttpServletRequest request) {
        //数据库查询到的对象，没有就会是一个null
        User dbUser = userDao.PDDoLogin(user);
        //没有session
        if (null == request.getSession(false)){
            HttpSession session = request.getSession();
            //查询到用户了就存放到session中，这里的session的存放到redis中的
            if (null != dbUser ){
                session.setAttribute("user",dbUser);
            }
        }
       return dbUser;
    }

    /**
     * insert
     * @return
     */
    @Override
    public boolean PSDoInsert(User user) {
        return userDao.PDDoInsert(user);

    }

    @Override
    public boolean PSDoDelete(int id) {
        return userDao.PDDoDelete(id);
    }
}
