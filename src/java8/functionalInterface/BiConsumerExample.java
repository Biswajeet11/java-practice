package java8.functionalInterface;

import java8.data.Student;
import java8.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static  void nameAndActivities(){
        List<Student> studentList = StudentDataBase.getAllStudents();
        BiConsumer<String,List<String>> biConsumer = (name, activityList)-> System.out.println(name + ":" + activityList);
        studentList.forEach((student -> biConsumer.accept(student.getName(),student.getActivities())));
    }



    public static void main(String[] args) {

        BiConsumer<String,String> biConsumer = (a,b)-> {
            System.out.println("a: "+ a + "b: "+ b);
        };

        biConsumer.accept("Java7", "Java8");

        BiConsumer<Integer,Integer> multiply = (a,b) -> {
            System.out.println("Multiply"+ (a*b));
        };

        BiConsumer<Integer,Integer> division = (a,b) -> {
            System.out.println("Division"+ (a/b));
        };

        multiply.andThen(division).accept(10,5);
        nameAndActivities();

    }
}
