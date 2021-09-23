package com.zj;

import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        ArrayList<Integer>[] integerList = new ArrayList[6];
//        可以使用声明带泛型的数组引用， 但是不可以声明带泛型的数组
//        ArrayList<Integer>[] objects = new ArrayList<Integer>();
        ArrayList<String>[] strList = new ArrayList[6];
//        这样就不可以，必须要类型一样
//        integerList[0] = strList;

    }
}
