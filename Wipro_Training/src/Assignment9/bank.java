package Assignment9;

class BankAccount {

    int balance = 5684;

    synchronized void deposit(int amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount + " | Balance: " + balance);
    }

    synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount + " | Balance: " + balance);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }
}

public class bank {

    public static void main(String[] args) {

        BankAccount acc = new BankAccount();

       
        Thread t1 = new Thread() {
            public void run() {
                for (int i = 0; i < 2; i++) {
                    acc.deposit(598);
                    try { Thread.sleep(100); } catch (Exception e) {}
                }
            }
        };

        
        Thread t2 = new Thread() {
            public void run() {
                for (int i = 0; i < 2; i++) {
                    acc.withdraw(267);
                    try { Thread.sleep(100); } catch (Exception e) {}
                }
            }
        };

        t1.start();
        t2.start();
    }
}