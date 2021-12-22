package com.zj.server;

import com.zj.dao.TestDao;
import com.zj.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TestServerImpl implements TestServer {
    @Autowired
    private TestDao testDao;

    @Override
    public List<User> findUsers() {
        return testDao.findUsers();
    }
}
