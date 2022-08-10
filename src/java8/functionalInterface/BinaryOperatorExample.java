package java8.functionalInterface;

import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    public static void main(String[] args) {
        BinaryOperator <Integer> operator = (a,b) -> a*b;

        System.out.println(operator.apply(10,3));
    }


}
