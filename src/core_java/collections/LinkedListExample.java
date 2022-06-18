package core_java.collections;

import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList();
        list.add("value1");
        list.add("value2");

        list.add(1,"value3");

        list.forEach(System.out::println);
    }
}
