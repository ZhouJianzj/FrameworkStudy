package com.zj.springbootrestful.web;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class restfulController {
    /**
     * 使用restful风格
     * @param id
     * @param name
     * @return
     */
    @PutMapping (value = "/putInsert/detail/{id}/{name}")
    public String putInsert(@PathVariable("id") Integer id,@PathVariable("name") String name){
        return "putInsert:" + id + " " + name;
    }

    /**
     * 这样会出现混淆的情况
     *  @PutMapping (value = "/putInsert/detail/{id}/{age}")
     * @param id
     * @param age
     * @return
     */
    @PutMapping (value = "/putInsert/{age}/detail/{id}")
    public String putInsertOne(@PathVariable("id") Integer id,@PathVariable("age") String age){
        return "putInsert:" + id + " " + age;
    }
}
