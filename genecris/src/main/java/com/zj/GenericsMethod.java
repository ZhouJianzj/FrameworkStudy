package com.zj;

public class GenericsMethod<T> {
    private T t;

    /**
     * 这个是泛型方法，泛型方法是带有<T>的，之前使用到泛型的方法不算泛型方法
     * @param e
     * @param <E>
     * @return
     */
    public <E> E getE(E e){
        return e;
    }

    /**
     * 泛型方可以是静态的，但是使用到泛型的方法不可以是静态的
     * @param e
     * @param <E>
     * @return
     */
    public static  <E> E getEStatic(E e){
        return e;
    }

    /**
     * 泛型方法中的参数可以是泛型可变长度的
     * @param e
     * @param <E>
     */
    public static  <E>  void getEStaticMult(E... e){
        for (int i = 0; i < e.length; i++) {
            System.out.println(e[i]);
        }
    }
}
class Test_GenericsMethod{
    public static void main(String[] args) {
        GenericsMethod<Object> objectGenericsMethod = new GenericsMethod<>();
        String zhoujian = objectGenericsMethod.getE("zhoujian");
        System.out.println(zhoujian);
        System.out.println("------------------------------------");
        Integer eStatic = GenericsMethod.getEStatic(123);
        System.out.println(eStatic);
        System.out.println("------------------------------------");
        GenericsMethod.getEStaticMult("zhoujian",123,true);
    }
}

