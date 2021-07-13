package com.zj.object;

public class Clone {
    /**
     * 浅clone
     * @param args
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        Person p = new Person("zhoujian",12,
                new Address("beijing",6));
        Person ps = (Person) p.clone();
//        false  复制之后内存地址一前一后
        System.out.println(p.equals(ps));
//        true
        System.out.println(ps instanceof Person);
//        true  测试的是浅的clone
        System.out.println(p.getName().equals(ps.getName()));
//        测试深的clone
        System.out.println(p.getAddress().toString());
        System.out.println(ps.getAddress().toString());
//本体改变副本不改变，深度clone
        p.setAddress(new Address("beijing",7));

        System.out.println(p.getAddress().toString());
        System.out.println(ps.getAddress().toString());

    }
}
class Person implements Cloneable{
    private String name;
    private int age;

    private  Address address;

    public Person() {
    }

    public Person(String name, int age,Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
        public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
class  Address{
    private String address;
    private int number;

    public Address() {
    }

    public Address(String address, int number) {
        this.address = address;
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return  this.address  +  " "  + this.number;
     }
}
