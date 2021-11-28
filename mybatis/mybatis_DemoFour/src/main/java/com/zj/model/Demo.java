package com.zj.model;

/**
 * 对应 与book表中的属性
 */
public class Demo {
    private int id;
    private String bookName;
    //    改变属性名字
    private String author;
    private int gender;
    private Double bookPrice;
    private String bookType;
    private String bookDesc;

    public Demo() {
    }

    public Demo(int id, String bookName, String author, int gender, Double bookPrice, String bookType, String bookDesc) {
        this.id = id;
        this.bookName = bookName;
        this.author = author;
        this.gender = gender;
        this.bookPrice = bookPrice;
        this.bookType = bookType;
        this.bookDesc = bookDesc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getauthor() {
        return author;
    }

    public void setauthor(String author) {
        this.author = author;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public Double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(Double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

    public String getBookDesc() {
        return bookDesc;
    }

    public void setBookDesc(String bookDesc) {
        this.bookDesc = bookDesc;
    }

    @Override
    public String toString() {
        return "Demo{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", gender=" + gender +
                ", bookPrice=" + bookPrice +
                ", bookType='" + bookType + '\'' +
                ", bookDesc='" + bookDesc + '\'' +
                '}';
    }
}
