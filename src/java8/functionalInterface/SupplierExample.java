package java8.functionalInterface;

import java8.data.Student;
import java8.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {
        Supplier<Student> studentSupplier = () -> {
            return new Student("Adam",2,4.0,"male", Arrays.asList("swimming", "basketball","volleyball"));
        };
        Supplier<List<Student>> listSupplier = () -> StudentDataBase.getAllStudents();

        System.out.println("student is "+studentSupplier.get());
        System.out.println("students are "+listSupplier.get());
    }

}
