package Assignment8;

import java.util.*;

public class ShoppingCart {
    public static void main(String[] args) {

        HashMap<String, Integer> productPrice = new HashMap<>();
        productPrice.put("Laptop", 75000);
        productPrice.put("Mobile", 30000);
        productPrice.put("Headphones", 2000);
        productPrice.put("Mouse", 1500);

        List<String> cart = new ArrayList<>();

        cart.add("Laptop");
        cart.add("Mouse");
        cart.add("Headphones");

        int total = 0;

        System.out.println("Items in Cart:");
        for (String item : cart) {
            int price = productPrice.get(item);
            System.out.println(item + " - ₹" + price);
            total += price;
        }

        System.out.println("Total Price: ₹" + total);
    }
}
