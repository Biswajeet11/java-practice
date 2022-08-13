package java8.streams;

import java8.data.Student;
import java8.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFlatMapExample {

    public static List<String> printStudentActivities(){

        List<String> studentActivities = StudentDataBase.getAllStudents()// List<Student>
                .stream()    // Stream<Student>
                .map(Student::getActivities) // Stream<List<String>>
                .flatMap(List::stream) // Stream<String>
                .sorted()
                .distinct()
                .collect(Collectors.toList());

        return studentActivities;
    }

    public static long getStudentActivitiesCount(){

        long noOfStudentActivities = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .count();

        return noOfStudentActivities;

    }

    public static void main(String[] args) {
        List<String> activity =  printStudentActivities();
        long value = getStudentActivitiesCount();

        System.out.println(activity);
        System.out.println(value);
    }

}
