package java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamLimitSkipExample {

    public static Optional<Integer> limit(List<Integer> integers){
        return integers.stream().limit(2)
                .reduce((x,y)->x+y);
    }

    public static Optional<Integer> skip(List<Integer> integers){
        return integers.stream().skip(2) // skip the 2 elements and add other
                .reduce((x,y)->x+y);
    }


    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(6,7,8,9,10);

        Optional<Integer> limitVal = limit(integerList);

        Optional<Integer> skipLimit = skip(integerList);

        if(limitVal.isPresent()){
            System.out.println(limitVal.get());
        }

        if(skipLimit.isPresent()){
            System.out.println(skipLimit.get());
        }
    }

}
