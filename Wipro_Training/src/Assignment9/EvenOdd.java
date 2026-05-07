package Assignment9;

public class EvenOdd {

    static int number = 1;

    public static void main(String[] args) {

        Thread t1 = new Thread() {
            public void run() {
                while (number < 100) {
                    synchronized (EvenOdd.class) {
                        if (number % 2 != 0) {
                            System.out.println("Odd: " + number);
                            number++;
                        }
                    }
                }
            }
        };

   
        Thread t2 = new Thread() {
            public void run() {
                while (number <= 100) {
                    synchronized (EvenOdd.class) {
                        if (number % 2 == 0) {
                            System.out.println("Even: " + number);
                            number++;
                        }
                    }
                }
            }
        };

        t1.start();
        t2.start();
    }
}