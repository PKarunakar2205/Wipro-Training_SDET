package Assignment11;

import java.util.Map;
import java.util.TreeMap;
import java.util.HashMap;

public class SortMapByKeys {

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(104, "Karunakar");
        map.put(66, "Sai");
        map.put(63, "Dinesh");
        map.put(51, "Ram");

        System.out.println("Before Sorting:");
        System.out.println(map);

        TreeMap<Integer, String> sortedMap =
                new TreeMap<>(map);

        System.out.println("\nAfter Sorting By Keys:");
        
        for (Map.Entry<Integer, String> entry :
                sortedMap.entrySet()) {

            System.out.println(entry.getKey()
                    + " = " + entry.getValue());
        }
    }
}