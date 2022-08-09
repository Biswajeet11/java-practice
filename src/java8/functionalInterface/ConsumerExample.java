package java8.functionalInterface;

import java8.data.Student;
import java8.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    static Consumer<Student> consumer2 = (student)-> System.out.println(student);
    static Consumer<Student> consumer3 = (student -> System.out.print(student.getName()));
    static Consumer<Student> consumer4 = (student -> System.out.print(student.getActivities()));

    public static void printNames() {
        System.out.println("Inside printNames");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(consumer2);
    }

    public static void printNameAndActivities() {
        System.out.println("Inside printNameAndActivities");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(consumer3.andThen(consumer4)); // consumer chaining

    }

    public static void printNameAndActivitiesUsingCondition() {
        System.out.println("Inside printNameAndActivitiesUsingCondition");
        List<Student> studentList = StudentDataBase.getAllStudents();

        studentList.forEach(student -> {
            if(student.getGradeLevel()>=3){
                consumer3.andThen(consumer4).accept(student);
            }
        });
    }

    public static void main(String[] args) {
        Consumer<String> consumer =  (s -> System.out.println(s.toUpperCase()));

        consumer.accept("java 8");
        printNames();
        printNameAndActivities();
        printNameAndActivitiesUsingCondition();
    }
}

