package com.zj.thread;

public class main {
    public static void main(String[] args) {
        Bank bank = new Bank("zhoujian", 10000);
        Thread mThread = new MThread(bank);

        Thread mThread1 = new MThread(bank);
        mThread.start();
        mThread1.start();
    }
}
