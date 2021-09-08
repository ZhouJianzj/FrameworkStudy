package com.zj.extend;

public class ExtFather {
    public String name;

    public ExtFather(){}

    public ExtFather(String name) {
        this.name = name;
        System.out.println(name);
    }

    public void doFOne(){
        System.out.print("父类的方法");
    }

    /**
     * 静态的方法不能被继承
     */
    public static void dodo(){

    }

    /**
     * 重写equals方法
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if (this instanceof ExtSonOne){
            return true;
        }
        return false;
    }
}
