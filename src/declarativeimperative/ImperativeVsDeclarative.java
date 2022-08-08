package declarativeimperative;

import java.util.stream.IntStream;

public class ImperativeVsDeclarative {

    public static  void main (String args[]) {
        /**
         * Imperative style of programming
         */
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum +=i;
        }
        System.out.println("Imperative style of programming " +sum);


        /**
         * Declarative style of programming
         */

        int sum1 = IntStream.rangeClosed(0,100) // it splits the values
                .parallel()
                .sum();

        System.out.println("Imperative style of programming " +sum1);
    }
}
