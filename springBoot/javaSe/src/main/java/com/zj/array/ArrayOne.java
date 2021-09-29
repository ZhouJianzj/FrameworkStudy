package com.zj.array;


/**
 * @author zhoujian
 * 数组的扩容
 */
public class ArrayOne {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = new int[5];
        System.arraycopy(a, 0, b, 0, a.length);

        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}