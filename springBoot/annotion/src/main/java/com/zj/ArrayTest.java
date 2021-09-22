package com.zj;

import java.lang.reflect.Array;

public class ArrayTest {
    public static void main(String[] args) {
        MyArray<String> array = new MyArray<>(String.class, 3);
        array.add("123");
        array.add("abc");
        array.add("zhoujian");
        array.show();
        array.add("zj");
        array.get(3);
    }
}

class MyArray<T> {
    /**
     * 原始的数值
     */
    private T[] array;
    /**
     * 扩容之后的数组
     */
    private T[] arrayC;
    /**
     * 数组最大长度，有初始值
     */
    private int maxSize = 3;
    /**
     * 数组中现有元素下标，判断是否需要扩容
     */
    private int rear = -1;

    /**
     * 有参 最大值 数组
     * @param type
     * @param maxSize
     */
    public MyArray(Class<T> type, int maxSize) {
        this.maxSize =  maxSize;
        this.array = getArray(type,maxSize);
    }


    /**
     *自定义数组的核心方法 指定大小以及类型这里是泛型，底层反射，泛型只是在编译的时候起作用，在运行的时候是被擦除的，
     * 下面的方式则即使是擦除了但是类加载器还在
     * @param type
     * @param maxSize
     * @param <T>
     * @return
     */
    private static <T> T[] getArray(Class<T> type, int maxSize) {
        return (T[]) Array.newInstance(type,maxSize);
    }

    /**
     * 展示数组，空就不会展示
     */
    public void show() {
        if (rear == -1) {
            System.out.println("数组为空");
            return;
        }
        for (int i=0; i<=rear; i++) {
            System.out.println(array[i]);
        }
    }

    /**
     *
     * @param item 添加元素，默认为object，只是一种编译时候的约束
     */
    public void add(T item) {
        rear++;
        if (rear >= maxSize) {
            System.out.println("数组已满-----扩容中" );
            //扩容，
            maxSize = maxSize * 2;
            arrayC = (T[]) copyArry(item.getClass(), maxSize);
            System.arraycopy(array,0,arrayC,0,array.length);
            array = arrayC;

//            return;
        }
        array[rear] = item;
    }
    public <T> T[] copyArry(Class<T> type, int maxSize){
        return (T[]) Array.newInstance(type,maxSize);
    }

    /**
     * 获取指定下标的元素
     * @param index 下标
     */
    public void get(int index) {
        if (index>rear) {
            System.out.println("所查下标不存在");
            return;
        }
        System.out.println(array[index]);
    }

}