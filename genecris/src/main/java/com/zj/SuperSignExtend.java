package com.zj;

import java.util.ArrayList;

public class SuperSignExtend {
    public static void main(String[] args) {
        ArrayList<Animals> animals = new ArrayList<>();
        ArrayList<Cat> cats = new ArrayList<>();
        ArrayList<MiniCat> miniCats = new ArrayList<>();
        SuperSignExtend.showUp(cats);
        SuperSignExtend.showUp(miniCats);
//        下面的方式是不可以的，因为ExtendSign.show(cats);上限就是cat
//        SuperSignExtend.show(animals);

//        子类可以全部添加到父类的集合中
//        cats.addAll(miniCats);



        SuperSignExtend.showDown(cats);
        SuperSignExtend.showDown(animals);
//      SuperSignExtend.showDown(miniCats);


    }

    /**
     * 使用extends 的方式指定上限，高于上限的则会添加不上去
     * @param arrayList
     * @param <T>
     */
    public static <T>void showUp (ArrayList<? extends Cat> arrayList){
//        这里不可以直接的添加指定子类或者上线类
//        arrayList.add(new Cat());
//        arrayList.add(new MiniCat());
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }

    /**
     * 指定下限，泛型的实参只能是下限或者是下限的父类
     * @param arrayList
     * @param <T>
     */
    public static <T> void showDown(ArrayList<? super Cat> arrayList){
//        里面可以添加下限以及下限的子类，但是不可以添加下限的父类
        arrayList.add(new Cat());
        arrayList.add(new MiniCat());
//        arrayList.add(new Animals());

        for (int i = 0; i < arrayList.size() ; i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
class Animals{}
class Cat extends Animals{}
class MiniCat extends Cat{}