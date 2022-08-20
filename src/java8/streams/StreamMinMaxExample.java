package java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMinMaxExample {


    public static int findMaxValue(List<Integer> integerList) {
       return integerList.stream()
                .reduce(0,(x,y)->x>y? x: y);
    }

    public static Optional<Integer> findMaxValueOptional(List<Integer> integerList) {
        return integerList.stream()
                .reduce((x,y)->x>y? x: y);
    }

    public static Optional<Integer> findMinValue(List<Integer> integerList){
        return integerList.stream()
                .reduce((x,y)->x<y? x: y);
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(6,7,8,9,10);

        int value = findMaxValue(integerList);
        Optional<Integer> val = findMaxValueOptional(integerList);
        System.out.println("value"+value);
        if(val.isPresent()){
            System.out.println("optional "+val.get());
        }

        Optional<Integer> minValue = findMinValue(integerList);
        if(minValue.isPresent()){
            System.out.println(minValue.get());
        }

    }

}
