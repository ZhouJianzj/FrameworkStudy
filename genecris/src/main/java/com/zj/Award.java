package com.zj;

import java.util.LinkedList;
import java.util.Random;

/**
 * @author zhoujian
 */
public class Award<T> {
    private T product;

    private LinkedList<T> linkedList = new LinkedList<T>();

    public void add(T t) {
        linkedList.add(t);
    }

    public T get() {
        return product = linkedList.get(new Random().nextInt(linkedList.size()));
    }

}
