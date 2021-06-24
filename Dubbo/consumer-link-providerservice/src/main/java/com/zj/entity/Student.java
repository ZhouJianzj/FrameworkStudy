package com.zj.entity;



import java.io.Serializable;

/**
 * 需要注意的是model需要序列化serializable,为了网络通信
 */
public class Student implements Serializable {
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
