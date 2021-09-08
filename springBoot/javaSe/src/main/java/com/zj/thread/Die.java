package com.zj.thread;

public class Die {
    public static void main(String[] args) {
        Object o2 = new Object();
        Object o1 = new Object();
        ThreadO threadO = new ThreadO(o1,o2);
        ThreadT threadT = new ThreadT(o1, o2);
        threadO.start();
        threadT.start();
    }
}
class ThreadO extends Thread{
    private  Object o1;
    private Object o2;


    public ThreadO(Object o1, Object o2) {
        this.o1 = o1;
        this.o2 = o2;
    }
    @Override
    public void run() {
        synchronized (o1){
            System.out.println(Thread.currentThread().getName());
            synchronized (o2){
                System.out.println(Thread.currentThread().getName());
            }
        }
    }
}
class ThreadT extends  Thread{
    private  Object o1;
    private Object o2;

    public ThreadT(Object o1, Object o2) {
        this.o1 = o1;
        this.o2 = o2;
    }

    @Override
    public void run() {
        synchronized (o2){
            System.out.println(Thread.currentThread().getName());
            synchronized (o1){
                System.out.println(Thread.currentThread().getName());
            }
        }
    }
}
