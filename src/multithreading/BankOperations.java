package multithreading;

public class BankOperations {

    public static void main(String[] args) throws InterruptedException {

        BankObj obj1 = new BankObj(1,1000);
        BankObj obj2 = new BankObj(2,2000);

        MyThread [] threads = new MyThread[6];


        threads[0] = new MyThread(obj1,100,false);
        threads[1] = new MyThread(obj1,50,true);
        threads[2] = new MyThread(obj1,100,false);


        threads[3] = new MyThread(obj2,200,true);
        threads[4] = new MyThread(obj2,100,false);
        threads[5] = new MyThread(obj2,250,true);


        for(int i=0;i<6;i++){
            threads[i].start();
        }

        for(int i=0;i<6;i++){
            threads[i].join();
        }

        System.out.println(obj1.getAccountBalance() + " " + obj2.getAccountBalance());

    }
}
