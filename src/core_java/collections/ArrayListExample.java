package core_java.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

    public static void main(String[] args) {

        /* create animalList */

        ArrayList<String> animalList = new ArrayList<>();

        animalList.add("Dog");
        animalList.add("Cat");
        animalList.add("Lion");


        /* adding a new element in list at a particular index */

        animalList.add(2,"Tiger");

        animalList.forEach(System.out::println);

        int n = 5;

        ArrayList<Integer> newList = new ArrayList<>(n);

        for (int i = 0; i <n ; i++) {
            newList.add(i);
        }

        newList.forEach(System.out::println);

        /* Iterator loop */

        Iterator<Integer> it = newList.iterator();

        while (it.hasNext()){
            System.out.println("iterator value "+ it.next());
        }

    }

}
