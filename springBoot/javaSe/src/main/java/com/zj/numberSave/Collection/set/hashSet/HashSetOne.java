package com.zj.numberSave.Collection.set.hashSet;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author zhoujian
 */
public class HashSetOne {
    public static void main(String[] args) {
        HashSet<String> strings = new HashSet<String>();
//        注意set的实现类的是不能有重复的元素的
        strings.add("zhou");
        strings.add("jian");
          strings.add("zhoujian");
//          方法一
        Object[] objects = strings.toArray();
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }
        System.out.println("==========================");

//        方法二
        Iterator<String> iterator = strings.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("================================");
        //        方法三
        strings.forEach(e -> System.out.println(e));


    }
}
