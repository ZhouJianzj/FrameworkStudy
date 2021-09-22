package com.zj;

/**
 * @author zhoujian
 */
public class Generics<T> {
    private T t;

    public Generics() {
    }

    public Generics(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
