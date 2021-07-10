package com.zj.extend;

public class ExtSonOne extends ExtFather {

    public ExtSonOne() {
    }

    public ExtSonOne(String zj){
        super(zj);
    }

    public void doSOne(){
        doFOne();
        System.out.println(super.name);
    }

    public static void main(String[] args) {
        new ExtSonOne("zhoujian").doSOne();
    }
}
