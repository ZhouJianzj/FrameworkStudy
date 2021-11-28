package entity;

public class SchoolSmall extends School {
    private String name = "zhoujian";
    private String address;


}

class dodo {
    public static void main(String[] args) {
        School school = new SchoolSmall();
        System.out.println(school.getName());
    }
}
