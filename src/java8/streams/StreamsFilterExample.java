package java8.streams;

import java8.data.Student;
import java8.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterExample {

    public static List<Student> filterStudents(){
       return StudentDataBase.getAllStudents()
                .stream()
                .filter((student -> student.getGender().equals("male")))
               .filter(student -> student.getGpa()>=3.9)
               .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Student> filterStudent = filterStudents();
        filterStudent.forEach(System.out::println);
    }
}
