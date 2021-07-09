package com.zj.privatee.privateTwo;

public class PTwo {
    private int i = 100;
    private void doTwo(){
        System.out.println("doTwo execute!");
    }

    /**
     * private 修饰的只能在本类中使用，变量也是
     */
    public void doThree(){
        doTwo();
        int a = i;
    }
}
