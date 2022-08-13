package java8.streams;

import java8.data.Student;
import java8.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsComparator {

    public static List<Student> sortStudentByName(){

        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());
    }

    public static List<Student> sortStudentByGpa(){

        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {


        sortStudentByName().forEach(System.out::println);
        System.out.println("--------------");
        sortStudentByGpa().forEach(System.out::println);
    }

}
