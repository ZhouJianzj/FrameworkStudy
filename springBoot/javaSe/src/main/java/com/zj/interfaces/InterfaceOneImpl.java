package com.zj.interfaces;

/**
 * @author zhoujian
 */
public class InterfaceOneImpl implements InterfaceOne {
    public String address;

    /**
     * 实现可以使用接口中的参数，而继承只能继承方法
     */
    @Override
    public void dodo() {
        System.out.println(name);
    }

    public void doPerson() {
    }

    public static void main(String[] args) {
        InterfaceOne i = new InterfaceOneImpl();
        i.dodo();
        System.out.println(InterfaceOne.address);
        System.out.println(InterfaceOne.age);
        System.out.println(InterfaceOne.name);


    }
}
