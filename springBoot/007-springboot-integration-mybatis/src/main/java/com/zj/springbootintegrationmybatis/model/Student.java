package com.zj.springbootintegrationmybatis.model;

public class Student {
    private Integer no;

    private String stuname;

    private String classname;

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname == null ? null : stuname.trim();
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname == null ? null : classname.trim();
    }
}