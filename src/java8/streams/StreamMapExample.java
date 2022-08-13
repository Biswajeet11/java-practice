package java8.streams;

import java8.data.Student;
import java8.data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamMapExample {

    public static Set<String> nameList() {

        Set<String> studentList = StudentDataBase.getAllStudents() // List<Student>
                .stream()  // Stream<Student>
                .map(Student::getName)  // Stream<String>
                .map(String::toUpperCase)
                .collect(Collectors.toSet());

        return studentList;
    }


    public static void main(String[] args) {
        Set<String> nameLists =  nameList();
        System.out.println(nameLists);

    }

}