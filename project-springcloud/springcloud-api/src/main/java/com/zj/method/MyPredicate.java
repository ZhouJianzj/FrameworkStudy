package com.zj.method;

import java.util.function.Predicate;

/**
 * @author zhoujian
 */
public class MyPredicate {


    public static void main(String[] args) {
        Predicate<String>  predicate = res ->res.equals("123");
        System.out.println(predicate.test("123"));
    }
}
