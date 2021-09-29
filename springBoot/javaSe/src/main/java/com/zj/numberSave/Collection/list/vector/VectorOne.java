package com.zj.numberSave.Collection.list.vector;

import java.util.Iterator;
import java.util.Vector;

public class VectorOne {
    public static void main(String[] args) {
        Vector<String> strings = new Vector<String>();
        for (int i = 0; i < 5; i++) {
            strings.add("zhoujian");
        }
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }
        System.out.println("========================");
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("================================");
        //        方法三
        strings.forEach(e -> System.out.println(e));

    }
}
