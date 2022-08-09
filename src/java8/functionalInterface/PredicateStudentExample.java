package java8.functionalInterface;

import java8.data.Student;
import java8.data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {

    static Predicate<Student> p1= (student) -> student.getGpa()>=3.9;

    static Predicate<Student> p2= (student) -> student.getGradeLevel()>=3;
    private static void filterStudentByGradeLevel() {
        List<Student> studentList = StudentDataBase.getAllStudents();

        studentList.forEach(student -> {
            if(p2.test(student)){
                System.out.println(student);
            }
        });
    }

    private static void filterStudentByGPALevel() {
        List<Student> studentList = StudentDataBase.getAllStudents();

        studentList.forEach(student -> {
            if(p1.test(student)){
                System.out.println(student);
            }
        });
    }

    private static void filterStudents() {
        List<Student> studentList = StudentDataBase.getAllStudents();

        studentList.forEach(student -> {
            if(p1.or(p2).negate().test(student)){
                System.out.println(student);
            } else {
                System.out.println(student);
            }
        });
    }

    public static void main(String[] args) {
        filterStudentByGradeLevel();
        filterStudentByGPALevel();
        filterStudents();
    }


}
