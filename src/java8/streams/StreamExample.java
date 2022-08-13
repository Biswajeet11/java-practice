package java8.streams;

import java8.data.Student;
import java8.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamExample {

    public static void main(String[] args) {


        Map<String, List<String>> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .filter(student -> student.getGradeLevel()>=3)
                .collect(Collectors.toMap(Student::getName,Student::getActivities));

        System.out.println(studentMap);
    }

}
