package java8.streams;


import java8.data.Student;
import java8.data.StudentDataBase;

import java.util.Optional;

public class StreamsFindAnyFirstExample {

    public static Optional<Student> findAnyStudent(){
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa()>=3.9)
                .findAny();
    }


    public static void main(String[] args) {
        Optional<Student> student = findAnyStudent();
        if(student.isPresent()){
            System.out.println(student.get());
        }

    }

}
