package com.zj.springbootlogforjavaback.model;

import lombok.Data;

/**
 * @author zhoujian
 * 这个注解不提供有参构造
 */
@Data
public class Test {
    private String name;
    private int id;
}

class TestT {
    public static void main(String[] args) {
        Test test = new Test();

    }
}
