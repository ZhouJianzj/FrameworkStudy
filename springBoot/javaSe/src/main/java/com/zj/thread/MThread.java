package com.zj.thread;

/**
 * @author zhoujian
 */
public class MThread extends Thread {
    public MThread(Bank bank) {
        this.bank = bank;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    private Bank bank;

    @Override
    public void run() {
        bank.drawMoney(5000);

    }
}
