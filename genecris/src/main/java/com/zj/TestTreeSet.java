package com.zj;

import java.util.Comparator;
import java.util.TreeSet;

public class TestTreeSet {
    public static void main(String[] args) {
        TreeSet<childOne> childOnes = new TreeSet<>(new ComparatorChildOne());
        TreeSet<childOne> childOnes1 = new TreeSet<>(new ComparatorParent());
//        这样是不可以的，因为treeset中的有参构造中的比较器是有下限的，也即是你指定的childOne
//        只能是childOne类或者是其父类
//        TreeSet<childOne> childOnes2 = new TreeSet<childOne>(new ComparetorChildTwo());

    }

}
class Parent{
    public String name;

    public Parent() {
    }

    public Parent(String name) {
        this.name = name;
    }
}
class childOne extends Parent{
    public Integer age;

    public childOne(Integer age) {
        this.age = age;
    }
}
class childTwo extends childOne{
    public Integer level;

    public childTwo(Integer age) {
        super(age);
    }
}
class ComparatorParent implements Comparator<Parent>{

    @Override
    public int compare(Parent o1, Parent o2) {
        return o1.name.compareTo(o2.name);
    }
}
class ComparatorChildOne implements Comparator<childOne>{

    @Override
    public int compare(childOne o1, childOne o2) {
        return o1.age - o2.age;
    }
}
class ComparetorChildTwo implements  Comparator<childTwo>{
    @Override
    public int compare(childTwo o1, childTwo o2) {
        return o1.level - o2.level;
    }
}
