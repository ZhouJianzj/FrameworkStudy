package com.zj;

public class thisTest {
    String name;

    public thisTest() {
    }

    public thisTest(String name) {
        this.name = name;
    }

    public void doThis() {
        System.out.println(this.name);
    }

    /**
     * 静态方法中是使用不了this的
     */
    public static void doStaticThis() {
//        System.out.println(this.name);
    }
}
