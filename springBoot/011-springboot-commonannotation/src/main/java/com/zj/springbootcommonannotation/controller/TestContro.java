package com.zj.springbootcommonannotation.controller;

import org.springframework.web.bind.annotation.*;

/**
 * 这个注解指定了这个控制器只能返回json数据，免去了书写@ResponseBody
 */
@RestController
public class TestContro {
    /**
     * 默认的接受get and post请求,后面的method可以省去
     *
     * @return
     */
    @RequestMapping(value = "/test1", method = {RequestMethod.POST, RequestMethod.GET})
    public String test1() {
        return "RequestMapping";
    }

    /**
     * 只接受get请求，一般用于select的时候
     *
     * @return
     */
    @GetMapping(value = "/testSelect")
    public String test2() {
        return "GetMapping";
    }

    /**
     * 只能接受post请求，一般用于insert
     *
     * @return
     */
    @PostMapping(value = "testInsert")
    public String test3() {
        return "PostMapping";
    }

    /**
     * 只能接收Delete请求，一般用于Delete
     *
     * @return
     */
    @DeleteMapping(value = "testDelete")
    public String testDelete() {
        return "DeleteMappingh";
    }

    /**
     * 只能接收update请求，一般用于update
     *
     * @return
     */
    @PutMapping(value = "testUpdate")
    public String testUpdate() {
        return "PutMapping";
    }
}
