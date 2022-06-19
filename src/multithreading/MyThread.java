package multithreading;

public class MyThread extends Thread {

    BankObj bankObj;
    int amount;
    boolean isDeposit;

    MyThread(BankObj bankObj, int amount, boolean isDeposit ){
        this.bankObj = bankObj;
        this.amount = amount;
        this.isDeposit = isDeposit;
    }


    @Override
    public void run() {

        if(this.isDeposit){
            try{
                deposit();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            try{
                withdraw();
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }


    public void deposit() throws InterruptedException {
        synchronized (BankObj.class){
            System.out.println("In thread - " + currentThread().getName() + ", deposit function, obj = " + this.bankObj);
            Thread.sleep(5000);
            if(this.bankObj !=null){
                int balance = this.bankObj.getAccountBalance();
                this.bankObj.setAccountBalance(balance+this.amount);
            }
            System.out.println("In thread ending - " + currentThread().getName() + ", deposit function, obj = " + this.bankObj);
        }
    }

    public void withdraw() throws InterruptedException {

        synchronized (BankObj.class) {
            System.out.println("In thread - " + currentThread().getName() + ", withdraw function, obj = " + this.bankObj);
            Thread.sleep(5000);
            if(this.bankObj != null) {
                int balance = this.bankObj.getAccountBalance();
                this.bankObj.setAccountBalance(balance - this.amount);
            }
            System.out.println("In thread ending - " + currentThread().getName() + ", withdraw function, obj = " + this.bankObj);
        }
    }
}
