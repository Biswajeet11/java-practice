package core_java.collections;

public class Student {
    private int age;
    private String name;
    private int rollNo;

    Student(String name , int age, int rollNo ){
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public  String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}
