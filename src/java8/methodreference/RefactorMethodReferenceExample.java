package java8.methodreference;

import java8.data.Student;
import java8.data.StudentDataBase;

import java.util.function.Predicate;

public class RefactorMethodReferenceExample {

    static Predicate<Student> p1 = RefactorMethodReferenceExample::greaterThanGradeLevel;

    public static boolean greaterThanGradeLevel(Student s){
        return s.getGradeLevel()>=3;
    }
    public static void main(String[] args) {
        System.out.println(StudentDataBase.studentSupplier.get());
    }
}
