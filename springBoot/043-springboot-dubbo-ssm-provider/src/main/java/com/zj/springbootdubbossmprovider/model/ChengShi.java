package com.zj.springbootdubbossmprovider.model;

public class ChengShi {
    private Integer id;

    private String name;

    private Integer proid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getProid() {
        return proid;
    }

    public void setProid(Integer proid) {
        this.proid = proid;
    }

    @Override
    public String toString() {
        return "ChengShi{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", proid=" + proid +
                '}';
    }
}