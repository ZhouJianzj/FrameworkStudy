package com.zj.numberSave.map.sortedMap.treeMap;


import java.util.TreeSet;

/**
 * @author zhoujian
 */
public class TreeMapOne {
    public static void main(String[] args) {
//        TreeSet中存放自定有的对象的时候，就不可以排序存储了，所以会出现ClassCastException
//        解决这个问题就是把Stu对象实现Comparable接口，并且重写里面的方法，重写的方法含义就是自定义排序规则

        TreeSet<Stu> treeSet = new TreeSet<>();
        treeSet.add(new Stu(01, "周健"));
        treeSet.add( new Stu(02, "李美钰"));
        for(Stu stu : treeSet){
            System.out.println(stu);
        }

    }
}
