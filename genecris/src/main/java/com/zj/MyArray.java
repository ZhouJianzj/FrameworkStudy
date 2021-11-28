package com.zj;

import java.lang.reflect.Array;

public class MyArray<T> {
    private T[] t;
    private int index = 0;

    public MyArray() {
    }

    public MyArray(Class<T> tClass, int length) {
        t = (T[]) Array.newInstance(tClass, length);
    }

    public void add(T item) {
        t[index++] = item;

    }

    public T get(int i) {
        return t[i];
    }
}

class TestMyArray {
    public static void main(String[] args) {
        MyArray<String> stringMyArray = new MyArray<>(String.class, 10);
        stringMyArray.add("one");
        stringMyArray.add("two");
        stringMyArray.add("three");
        stringMyArray.add("four");
        System.out.println(stringMyArray.get(0));


    }
}
