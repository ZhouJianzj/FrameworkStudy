package com.zj.numberSave.map.HashMap;

import java.util.HashMap;
import java.util.Set;

/**
 * @author zhoujian
 */
public class HashMapOne {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("One","zhoujian");
        hm.put("two","zhoujian");
        hm.put("three","zhoujian");
        hm.put("four","zhoujian");
        Set<String> strings = hm.keySet();
//        方法一
        strings.forEach(e ->{
//            e 表示的是set种的元素
            System.out.println(hm.get(e));
        });
        System.out.println("======================");
//方法二
        //先转换成数组
        Object[] objects = strings.toArray();
        //对数组进行遍历
        for (int i = 0; i < objects.length; i++) {
            //map方法获取get（key）value
            System.out.println(hm.get(objects[i]));

        }
    }
}
