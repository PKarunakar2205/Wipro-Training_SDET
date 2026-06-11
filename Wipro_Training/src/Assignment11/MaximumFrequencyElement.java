package Assignment11;

import java.util.HashMap;

public class MaximumFrequencyElement {

    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 20, 40, 20, 50, 10};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {

            if (map.containsKey(num)) {

                map.put(num, map.get(num) + 1);

            } else {

                map.put(num, 1);
            }
        }

        int maxFreq = 0;
        int maxElement = 0;

        for (int key : map.keySet()) {

            if (map.get(key) > maxFreq) {

                maxFreq = map.get(key);
                maxElement = key;
            }
        }

        System.out.println("Array Elements:");
        
        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println("\n\nMost Repeated Element : " + maxElement);
        System.out.println("Frequency Count       : " + maxFreq);
    }
}