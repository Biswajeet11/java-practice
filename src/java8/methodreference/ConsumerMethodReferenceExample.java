package java8.methodreference;

import java8.data.Student;
import java8.data.StudentDataBase;

import java.util.function.Consumer;

public class ConsumerMethodReferenceExample {
    static Consumer<Student> c1 = System.out::println;
    static Consumer<Student> c2 = Student::printListOfActivities;

    public static void main(String[] args) {

        StudentDataBase.getAllStudents().forEach(c1);
        System.out.println("-----------------------");
        StudentDataBase.getAllStudents().forEach(c2);
    }
}
