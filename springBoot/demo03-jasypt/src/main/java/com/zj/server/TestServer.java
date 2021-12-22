package com.zj.server;


import com.zj.entity.User;

import java.util.List;

public interface TestServer {
    List<User> findUsers();
}
