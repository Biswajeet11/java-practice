package java8.functionalInterface;

import java.util.function.Predicate;

public class PredicateExample {

    static  Predicate<Integer> p1 = (i) -> i%2 == 0;
    static  Predicate<Integer> p2 = (i) -> i%2 == 0;

    public static  void predicateAnd(){
        System.out.println("predicateAnd 1 "+p1.and(p2).test(10)); // predicate chaining
        System.out.println("predicateAnd 2 "+p1.and(p2).test(9));
    }

    public static  void predicateOr() {
        System.out.println("predicateOr 1 "+p1.or(p2).test(10)); // predicate chaining
        System.out.println("predicateOr 2 "+p1.or(p2).test(9));
    }

    public static void predicateNegate() {
        System.out.println("predicateNegate "+p1.or(p2).negate().test(10));
    }

    public static void main(String[] args) {

        System.out.println(p1.test(4));
        System.out.println(p2.test(4));
        predicateAnd();
        predicateOr();
    }

}
