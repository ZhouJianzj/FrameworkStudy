package com.zj;

public class Sign<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}

class TestSign {
    public static void main(String[] args) {
        Sign<String> stringSign = new Sign<>();
        stringSign.setT("zhoujian");
        Object show = TestSign.show(stringSign);
        System.out.println(show);

        Sign<Integer> integerSign = new Sign<>();
        integerSign.setT(12323);
        Object show1 = TestSign.show(integerSign);
        System.out.println(show1);
    }

    /**
     * 通配符，代表的是实参例如 String  Integer 什么的
     *
     * @param sign
     * @return
     */
    public static Object show(Sign<?> sign) {
        Object t = sign.getT();
        return t;
    }
}
