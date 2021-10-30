package com.zj.method;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

/**
 * @author zhoujian
 *
 * 双列集合使用流的时候需要首先转换成单列集合
 */
public class MapStream {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("One",1);
        map.put("Two",2);
        map.put(" Thress",3);
        map.put(" Thress",3);
        map.put(" Thress",3);
        map.put(" Thress",3);
//        map使用流需要给它转换成单列集合才可以使用流
        map.entrySet().stream()
                .distinct()
                .filter((entry) -> {
                     return  entry.getValue() <= 2;
                })
                .forEach((entry)->{
                    System.out.println(entry.getKey() + "===" + entry.getValue());
                });
    }
}
