package core_java.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample2 {

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        Student st1 = new Student("Ram",13,10);

        Student st2 = new Student("Abhi",12,1);

        Student st3 = new Student("John",12,8);

        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);

        Iterator<Student> it = studentList.iterator();

        while(it.hasNext()){
            Student st = it.next();
          System.out.println(" Student name "+ st.getName() +" student age " + st.getAge() + " RollNo. " + st.getRollNo());
        }
    }
}
