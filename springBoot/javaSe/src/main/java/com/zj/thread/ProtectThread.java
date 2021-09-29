package com.zj.thread;


class Mian {
    public static void main(String[] args) {
        ProtectThread protectThread = new ProtectThread();
//        设置为守护线程
        protectThread.setDaemon(true);
        Thread thread = Thread.currentThread();
        thread.setName("Mian");
        protectThread.start();
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(thread.getName() + "----" + i);
        }

    }
}

/**
 * @author zhoujian
 */
public class ProtectThread extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (true) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "----" + (++i));
        }
    }
}
