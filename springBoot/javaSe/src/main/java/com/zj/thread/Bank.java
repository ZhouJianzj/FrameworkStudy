package com.zj.thread;

public class Bank {
    private String account;
    private int money;

    public void drawMoney(int outMoney) {
        synchronized (this) {
            int i = this.getMoney() - outMoney;
            this.setMoney(i);
            System.out.println(Thread.currentThread().getName() + "------>" + money);
        }
    }

    public Bank(String account, int money) {
        this.account = account;
        this.money = money;
    }

    public Bank() {
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
