package com.zj.extend;

public class ExtFather {
    String name;
    public ExtFather(){}
    public ExtFather(String name) {
        this.name = name;
    }

    public void doFOne(){
        System.out.println(name);
    }
}
