package com.zj.method;

public class Lambda {
    public static void main(String[] args) {
        System.out.println(doAdd((a, b) -> {
            return a + b;
        }));

        Integer integer = doZhuaHuan(s -> Integer.valueOf(s));
        System.out.println(integer);
    }

    public static int doAdd(Oper oper) {
        int a = 10;
        int b = 11;
        return oper.doAdd(a, b);
    }

    /**
     * @param operFanXin
     * @param <R>        返回值的类型
     * @return
     */
    public static <R> R doZhuaHuan(OperFanXin<String, R> operFanXin) {
        String a = "123";
        return operFanXin.zhuanHuan(a);
    }
}

/**
 * 接口中的方法没有实现
 */
interface Oper {
    int doAdd(int a, int b);
}

interface OperFanXin<T, R> {
    /**
     * @param t 传入的参数类型
     * @return R 返回值类型
     */
    R zhuanHuan(T t);
}