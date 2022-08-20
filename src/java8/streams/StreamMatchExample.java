package java8.streams;

import java8.data.StudentDataBase;

public class StreamMatchExample {

    public static boolean allMatch(){
        return StudentDataBase.getAllStudents()
                .stream().allMatch(student -> student.getGpa()>=3.9); // if all the values match this condition returns true
    }

    public static boolean anyMatch(){
        return StudentDataBase.getAllStudents()
                .stream().anyMatch(student -> student.getGpa()>=3.9); // if all the values match this condition returns true
    }

    public static boolean noneMatch(){
        return StudentDataBase.getAllStudents()
                .stream().noneMatch(student -> student.getGpa()>=4.0); // if all the values match this condition returns true
    }

    public static void main(String[] args) {
        System.out.println("All match "+allMatch());
        System.out.println("Any Match "+ anyMatch());
        System.out.println("None Match "+ noneMatch());
    }

}
