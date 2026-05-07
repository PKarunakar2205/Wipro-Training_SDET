package First_Day;

public class Emp {

    static String bankName = "State Bank of India";
    int accountNumber;
    String holderName;
    double balance;

    void deposit(double amount) {

        double updatedBalance = balance + amount;

        System.out.println("Bank Name = " + bankName);
        System.out.println("Account Holder = " + holderName);
        System.out.println("Deposited Amount = " + amount);
        System.out.println("Updated Balance = " + updatedBalance);
    }

    public static void main(String[] args) {

        Emp acc1 = new Emp();

        acc1.accountNumber = 12345;
        acc1.holderName = " P Karunakar";
        acc1.balance = 5000;

        acc1.deposit(2000);
    }
}