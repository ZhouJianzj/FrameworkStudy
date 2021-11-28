package com.example.swagger.controller;

import com.example.swagger.annotation.IgnoreApi;
import com.example.swagger.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @author zhoujian
 */
@RestController
@Api(value = "userController",description = "接口测试文档")
@RequestMapping("hello")
public class Hello {

    @GetMapping("get")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "namespace",value = "用户的命名空间",required = true,
                    paramType = "字符串"),
            @ApiImplicitParam(name = "password",value = "密码",required = true,
                    paramType = "字符串")
    })
    public String testGet(String namespace,String password) {
        return "getMapping";
    }

    /**
     * 测试返回对象
     */
    @ApiOperation(value = "user",notes = "测试接口")
    @GetMapping("user")
    public User testUser(){
        return new User();
    }

    @PostMapping("post")
    @IgnoreApi
    public String testPost(){
        return "postMapping";
    }

    @PutMapping("put")
    @IgnoreApi
    public String testPut(){
        return "putMapping";
    }

    @DeleteMapping("delete")
    @IgnoreApi
    public String testDelete(){
        return "delete";
    }

}