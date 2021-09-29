package com.zj.thread;

import java.util.ArrayList;

/**
 * @author zhoujian
 */
public class ProductAndConsume {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        Product product = new Product(arrayList);
        Consumer consumer = new Consumer(arrayList);
        product.start();
        consumer.start();
    }
}

class Product extends Thread {
    private ArrayList arrayList;

    @Override
    public void run() {
        synchronized (arrayList) {
            while (true) {
                if (arrayList.size() <= 0) {
                    arrayList.add(new Object());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "生产成功");
                }
                try {
//                    使线程等待，释放对象锁
                    arrayList.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                arrayList.notify();
            }
        }
    }

    public Product(ArrayList arrayList) {
        this.arrayList = arrayList;
    }
}

class Consumer extends Thread {
    private ArrayList arrayList;

    @Override
    public void run() {
        synchronized (arrayList) {
            while (true) {
                if (arrayList.size() > 0) {
                    arrayList.remove(0);
                    System.out.println(Thread.currentThread().getName() + "移除成功");
                }
//                唤醒wait中的线程，本线程不释放锁还在执行
                arrayList.notify();
                try {
                    arrayList.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public Consumer(ArrayList arrayList) {
        this.arrayList = arrayList;
    }
}

