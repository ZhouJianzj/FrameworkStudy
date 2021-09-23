package com.zj;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 没有上限的时候会擦除成Object类型，有上限的时候会以上限的类型
 */
public class Erasure {
    public static void main(String[] args) throws NoSuchFieldException {
        Class<? extends ErasureExtend> aClass = new ErasureExtend<Integer>().getClass();
        Field t = aClass.getDeclaredField("t");
        System.out.println(t.getType().getSimpleName());
    }
}
class ErasureExtend<T >{
  public T t;
}
class ErasureSuper<E>{
}
