package java8.streams;

import java.util.Arrays;
import java.util.List;

public class StreamReduceExample {

    public static int performMultiplication(List<Integer> integerList){
        return integerList.stream()
                .reduce(1,(a,b)-> a*b);
    }





    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(1,3,5,7);

    }

}
