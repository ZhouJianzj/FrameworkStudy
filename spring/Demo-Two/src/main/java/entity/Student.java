package entity;

public class Student {
    private int id;
    private String name ;
    private int age = 22;
    private String email;

    public Student() {
        this.name = "zhouJian";
    }

    public Student(int id, String name, int age, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("=============");
    }

    @Override
    public String toString() {
        String info = id + " " + name + " " + age + " " + email;
return info;
    }
}
