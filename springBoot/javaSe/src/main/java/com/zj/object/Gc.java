package com.zj.object;

public class Gc {
    public static void main(String[] args) {
        doTest doTest = new doTest();
        doTest = null;
        System.gc();
    }

}

class doTest{

    @Override
    protected void finalize() throws Throwable {
        System.out.println("资源准备销毁");
    }
}