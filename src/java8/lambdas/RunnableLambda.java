package java8.lambdas;

    public class RunnableLambda {


        public static void main(String[] args) {

            /**
             * Prior java 8
             */

            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    System.out.println("Inside Runnable 1");
                }
            };
            new Thread(runnable).start();


            /**
             *  Java 8 Lambda
             */
            Runnable runnableLambda = () -> {
                System.out.println("Inside Runnable 2");
            };

            new Thread(runnableLambda).start();

        }



    }

