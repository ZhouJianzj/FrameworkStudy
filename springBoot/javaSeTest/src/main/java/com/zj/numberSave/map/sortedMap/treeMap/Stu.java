package com.zj.numberSave.map.sortedMap.treeMap;

/**
 * @author zhoujian
 */
public class Stu implements Comparable {
    private int num;

    private String name;

    public Stu() {
    }

    public Stu(int num, String name) {
        this.num = num;
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Object o) {
        Stu s = (Stu) o;
        return this.num - s.num;
    }
}
