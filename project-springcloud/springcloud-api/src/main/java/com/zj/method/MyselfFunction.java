package com.zj.method;

/**
 * 函数式编程只关注接口方法的方法参数和操作
 */
public class MyselfFunction {
    public static void main(String[] args) {
        System.out.println(execute(str -> {
            return str + "zhoujian";
        }));
    }

    /**
     * 接口作为参数，调用接口的方法但是接口的方法没有重写，具体的从写在函数式代码块中
     * @param myInterface
     * @return
     */
    public static String execute(MyInterface<String> myInterface){
        String str = "zhoujian";
        return myInterface.execute(str);
    }
}

interface MyInterface<T>{
    public T execute(T t);
}
