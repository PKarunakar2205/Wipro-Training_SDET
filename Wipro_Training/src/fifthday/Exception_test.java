package fifthday;

import java.util.Scanner;

public class Exception_test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter dividend:");
        int a = sc.nextInt();

        System.out.println("Enter divisor:");
        int b = sc.nextInt();

        try {
            int c = a / b;
            System.out.println("Division is = " + c);
        } 
        catch (ArithmeticException e) {
            System.out.println("Exception: " + e);
        } 
        finally {
            System.out.println("pass the level");
        }

        System.out.println("End");
        sc.close();
    }
}