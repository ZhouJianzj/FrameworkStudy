package com.zj.thread;

/**
 * @author zhoujian
 */
public class ThreadOne {
    public static void main(String[] args) {
        Thread zhouJianThread = new Thread("zhouJianThread");
        MyThread myThread = new MyThread();
        try {
//            由于sleep是静态的方法，可以使用myThread()的方式去调用不会报错，当为null的时候也不会出错，
//            只因为是静态方法，子类调用的时候会默认是父类对象调用，
//            这里的sleep所管的线程是main线程，而不是myThread
//           Thread.sleep(121);
            myThread.sleep(121);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        zhouJianThread.start();
        System.out.println("========");
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("++++++++++++");
    }
}

class Do {
    public static void doDo() {
    }
}

class DoDo extends Do {


}

class Main {
    public static void main(String[] args) {
        DoDo doDo = new DoDo();
        Do.doDo();
    }
}
