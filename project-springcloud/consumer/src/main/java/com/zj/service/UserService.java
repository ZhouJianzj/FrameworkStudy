package com.zj.service;


import com.zj.entities.CommonResponse;
import com.zj.entities.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "gateway")
public interface UserService {


    @PostMapping("/user/login")
    CommonResponse<User> SSDoLogin(@RequestBody User user);

    @GetMapping("/user/NoLogin")
    String SSDoNoLogin();
}
