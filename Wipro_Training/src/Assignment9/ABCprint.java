package Assignment9;

public class ABCprint {

    public static void main(String[] args) {

        Thread t1 = new Thread() {
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.print("A ");
                    try { Thread.sleep(300); } catch (Exception e) {}
                }
            }
        };

        
        Thread t2 = new Thread() {
            public void run() {
                try { Thread.sleep(100); } catch (Exception e) {}
                for (int i = 0; i < 20; i++) {
                    System.out.print("B ");
                    try { Thread.sleep(300); } catch (Exception e) {}
                }
            }
        };

        
        Thread t3 = new Thread() {
            public void run() {
                try { Thread.sleep(200); } catch (Exception e) {}
                for (int i = 0; i < 20; i++) {
                    System.out.print("C ");
                    try { Thread.sleep(300); } catch (Exception e) {}
                }
            }
        };

        t1.start();
        t2.start();
        t3.start();
    }
}