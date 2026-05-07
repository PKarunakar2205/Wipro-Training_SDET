package MultiThreading;


public class ThreadJoinDemo {

    static class JoinThread extends Thread {
        public void run() {
            for (int i = 1; i <= 2; i++) {
                System.out.println(i + " - " + Thread.currentThread().getName());
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {

        JoinThread t = new JoinThread();
        JoinThread t1 = new JoinThread();
        JoinThread t2 = new JoinThread();

        t.start();
        t1.start();
        t2.start();

        t.join(); // wait for t to finish
        System.out.println("Thread joined, proceed.");
    }
}