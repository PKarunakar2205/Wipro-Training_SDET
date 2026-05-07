package Lambda;
interface Calcu {
    int ope(int a, int b);
}

public class Calculator {
    public static void main(String[] args) {

        Calcu add = (a, b) -> a + b;
        Calcu sub = (a, b) -> a - b;
        Calcu mul = (a, b) -> a * b;
        Calcu div = (a, b) -> a / b;

        System.out.println("Addition = " + add.ope(25, 24));
        System.out.println("Subtraction = " + sub.ope(14, 7));
        System.out.println("Multiplication = " + mul.ope(56, 20));
        System.out.println("Division = " + div.ope(84, 12));
    }
}

