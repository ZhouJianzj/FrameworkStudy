package com.Jianzhou.entities;

/**
 * 商品仓库
 */
public class Good {
    private int id;
    private String name;
    private int price;
    private int mun;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getMun() {
        return mun;
    }

    public void setMun(int mun) {
        this.mun = mun;
    }
}
