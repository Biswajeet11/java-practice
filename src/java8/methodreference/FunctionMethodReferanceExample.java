package java8.methodreference;

import java.util.function.Function;

public class FunctionMethodReferanceExample {

    static Function<String,String> getToUpperCaseLambda = (s -> s.toUpperCase());

    static Function<String,String> toUpperCaseMethodReference =  String::toUpperCase;


    public static void main(String[] args) {
        System.out.println(getToUpperCaseLambda.apply("java8"));

        System.out.println(toUpperCaseMethodReference.apply("java8"));
    }

}
