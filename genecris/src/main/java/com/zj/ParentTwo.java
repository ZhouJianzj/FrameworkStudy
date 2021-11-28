package com.zj;

public class ParentTwo<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}

/**
 * 当子类不是一个泛型类的时候，父类的泛型必须指定
 */
class ChildTwo extends ParentOne<String> {
    @Override
    public String getT() {
        return super.getT();
    }

    @Override
    public void setT(String s) {
        super.setT(s);
    }
}
