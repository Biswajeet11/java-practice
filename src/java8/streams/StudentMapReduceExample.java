package java8.streams;

import java8.data.Student;
import java8.data.StudentDataBase;

public class StudentMapReduceExample {

    private static int noOfNoteBooks(){
       int noOfNotebooks =  StudentDataBase.getAllStudents().stream() // Stream<Student>
                .map(Student::getNoteBooks)
//                .reduce(0,(a,b)->a+b);
               .reduce(0,Integer::sum);
       return noOfNotebooks;
    }



    public static void main(String[] args) {
        int val = noOfNoteBooks();
        System.out.println(val);


    }

}
