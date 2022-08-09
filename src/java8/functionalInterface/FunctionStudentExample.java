package java8.functionalInterface;

import java8.data.Student;
import java8.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionStudentExample {


    static Function<List<Student>, Map<String,Double>> studentFunction = (students -> {
        Map<String,Double> studentGpaMap = new HashMap<>();

        students.forEach(student -> {
            studentGpaMap.put(student.getName(),student.getGpa());
        });
        return studentGpaMap;
    });

    public static void main(String[] args) {
        System.out.println(studentFunction.apply(StudentDataBase.getAllStudents()));
    }
}
