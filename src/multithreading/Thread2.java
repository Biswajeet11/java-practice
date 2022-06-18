package multithreading;

import java.util.Random;

public class Thread2 {

    static Random random = new Random(System.currentTimeMillis());

    public static void main(String[] args) throws InterruptedException {

        ThreadUnsafeCounter badCounter = new ThreadUnsafeCounter();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100 ; i++) {
                    badCounter.increment();
                    Thread2.sleepRandomlyForLessThan10Secs();
                }
            }
        });


        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<100;i++){
                    badCounter.decrement();
                    Thread2.sleepRandomlyForLessThan10Secs();
                }
            }
        });

        /* run both the threads */
        t1.start();
        t2.start();

        /* wait for t1 and t2 to complete */
        t1.join();
        t2.join();

        /* print final value of counter */
        badCounter.printFinalCounterValue();
    }

    public static void sleepRandomlyForLessThan10Secs(){
        try {
            Thread.sleep(random.nextInt(10));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


class ThreadUnsafeCounter {

    int counter = 0;

    public void increment() {
       counter++;
    }

    public void decrement() {
        counter--;
    }

    void printFinalCounterValue(){
        System.out.println("counter "+counter);
    }

}
