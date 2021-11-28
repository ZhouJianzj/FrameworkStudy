package com.zj;

public class ParentOne<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}

/**
 * 子类要和父类的泛型一致
 *
 * @param <T>
 */
class ChildOne<T, E> extends ParentOne<T> {
    @Override
    public T getT() {
        return super.getT();
    }

    @Override
    public void setT(T t) {
        super.setT(t);
    }
}
