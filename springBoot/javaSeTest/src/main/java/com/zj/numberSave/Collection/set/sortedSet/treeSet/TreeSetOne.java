package com.zj.numberSave.Collection.set.sortedSet.treeSet;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author zhoujian
 */
public class TreeSetOne {
    public static void main(String[] args) {
        TreeSet<String> strings = new TreeSet<String>();
        strings.add("zhoujian");
        strings.add("zhou");
        strings.add("jian");
//        方法三
        strings.forEach(e -> System.out.println(e));
        System.out.println("==========================");
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
    }
}
