package com.zj;

import java.util.Arrays;

/**
 * @author zhoujian
 */
public class MyArr<T> {
    Object[] arr = {};
    int size;

    public void add(T t) {
        if (arr.length == 0) {
            arr = Arrays.copyOf(arr, 10);
        } else if (arr.length == size) {//容量不够
            int newCapacity = arr.length + (arr.length >> 1);
            arr = Arrays.copyOf(arr, newCapacity);
        }
        arr[size++] = t;
    }

    public T get(int index) {
        if (index > size - 1) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
        return (T) arr[index];
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (Object o : arr) {
            if (o == null) {
                break;
            }
            sb.append(o.toString() + ",");
        }
        sb.replace(sb.length() - 1, sb.length(), "]");
        return sb.toString();
    }
}