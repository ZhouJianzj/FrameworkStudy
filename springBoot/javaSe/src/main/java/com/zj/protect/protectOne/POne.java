package com.zj.protect.protectOne;

import com.zj.protect.protectTwo.PTwo;

public class POne extends  PTwo{
    protected void doOne(){
        System.out.println("protectOne execute");
    }

    public static void main(String[] args) {
//        new PTwo().  这里就使用不到受保护的daTwo（）方法
//        需要调用到需要继承PTwo,但是又不在同一个包下还是使用不到
//
        PTwo pTwo = new PTwo();
    }

    @Override
    protected void doTwo() {
        super.doTwo();
    }
}
