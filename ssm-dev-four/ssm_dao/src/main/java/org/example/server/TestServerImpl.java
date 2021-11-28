package org.example.server;

import org.example.dao.UserDao;
import org.example.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServerImpl implements TestServer {

    @Autowired
    private UserDao userDao;

    @Override
    public void testGet() {
        User user = userDao.get(1);
        System.out.println(user.toString());
    }
}
