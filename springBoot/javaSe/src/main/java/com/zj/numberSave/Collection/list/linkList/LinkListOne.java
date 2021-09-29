package com.zj.numberSave.Collection.list.linkList;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author zhoujian
 */
public class LinkListOne {
    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<String>();
        for (int i = 0; i < 5; i++) {
            strings.add("zhoujian");
        }

//        方法一
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }
        System.out.println("===========================");
//        方法二
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("================================");
        //        方法三
        strings.forEach(e -> System.out.println(e));

    }
}
