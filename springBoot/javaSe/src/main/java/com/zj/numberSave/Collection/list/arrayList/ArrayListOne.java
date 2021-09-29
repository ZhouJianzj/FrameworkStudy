package com.zj.numberSave.Collection.list.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author zhoujian
 */
public class ArrayListOne {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
//        添加元素
        for (int i = 0; i < 5; i++) {
            strings.add("zhoujian");
        }
////          方法一
//        for (int i = 0; i < strings.size(); i++) {
//            System.out.println(strings.get(i));
//        }
//        System.out.println("==============================");
////        方法二
        Iterator<String> iterator = strings.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//        System.out.println("====================");
////        方法三
//        strings.forEach(e -> System.out.println(e));
//        System.out.println("====================");

//        移除元素,这样的运行会出错
//        System.out.println("移除下标为0的元素" + strings.remove(0));
        iterator.remove();
        while (iterator.hasNext()) {

            System.out.println(iterator.next());

        }
    }
}
