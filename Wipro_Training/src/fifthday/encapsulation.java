package fifthday;


class BankAccount {
    private double balance;

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid amount");
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public double getBalance() {
        return balance;
    }
}

// Student class
class Student {
    protected String name = "Karunakar";
    public int rollno = 101;

    public String getName() {
        return name;
    }
}

// Main class
public class encapsulation {
    public static void main(String[] args) {

        BankAccount acc = new BankAccount();

        acc.deposit(1000);
        acc.withdraw(2000);

        System.out.println("Balance = " + acc.getBalance());

        Student st = new Student();

        System.out.println("Roll No: " + st.rollno);
        System.out.println("Name: " + st.getName());
    }
}