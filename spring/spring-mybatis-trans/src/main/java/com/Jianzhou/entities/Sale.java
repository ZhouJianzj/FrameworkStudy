package com.Jianzhou.entities;

/**
 * 销售表
 */
public class Sale {
    private int id;
    private int gId;
    private int saleNum;

    public Sale(Integer gId, Integer saleNum) {
        this.gId = gId;
        this.saleNum = saleNum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getgId() {
        return gId;
    }

    public void setgId(int gId) {
        this.gId = gId;
    }

    public int getSaleNum() {
        return saleNum;
    }

    public void setSaleNum(int saleNum) {
        this.saleNum = saleNum;
    }
}
