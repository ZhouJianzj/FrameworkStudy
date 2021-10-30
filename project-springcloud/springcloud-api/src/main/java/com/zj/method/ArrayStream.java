package com.zj.method;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author zhoujian
 */
public class ArrayStream {
    public static void main(String[] args) {
        Integer[] integers = {1,23,3,1,2,1,1,4,5,6};

//        forEach里面的lambda表达式可以使用System.out::println来代替
        //可以使用Arrays.stream方法来将数组转换成流的形式
        Arrays.stream(integers)
                .distinct()
                .forEach(System.out::println);
        System.out.println("=============================");
//        使用Stream.of()方法将数组转换成流
        Stream.of(integers)
                .distinct()
                .forEach(System.out:: println);
    }
}
