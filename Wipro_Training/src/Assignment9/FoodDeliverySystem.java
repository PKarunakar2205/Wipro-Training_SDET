package Assignment9;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class OrderTask implements Runnable {

    int orderId;

    OrderTask(int orderId) {
        this.orderId = orderId;
    }

    public void run() {

        String agent = Thread.currentThread().getName();

        System.out.println(agent + " picked Order " + orderId);

        try {
            Thread.sleep(1000);
        } catch (Exception e) {}

        System.out.println(agent + " delivering Order " + orderId);

        try {
            Thread.sleep(1000);
        } catch (Exception e) {}

        System.out.println(agent + " completed Order " + orderId);
    }
}

public class FoodDeliverySystem {

    public static void main(String[] args) {

        ExecutorService pool = Executors.newFixedThreadPool(2); 

        for (int i = 1; i <= 3; i++) {
            pool.execute(new OrderTask(i));
        }

        pool.shutdown();
    }
}