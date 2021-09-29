package com.zj.reflect;

/**
 * @author zhoujian
 */
public class ReflectTwo {
    public static void main(String[] args) throws ClassNotFoundException {
//         这又new 和  forName的时候会执行静态代码
//        Class.forName("com.zj.reflect.Dodo");

//        Dodo dodo = new Dodo();
//        dodo.getClass();
        Class<Dodo> dodoClass = Dodo.class;
    }
}

class Dodo {
    static {
        System.out.println("=================");
    }
}
