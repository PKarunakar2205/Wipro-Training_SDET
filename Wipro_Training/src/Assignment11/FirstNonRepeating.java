package Assignment11;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeating {

    public static void main(String[] args) {

        String str = "success";

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {

            if (entry.getValue() == 1) {

                System.out.println("First Non-Repeating Character: "
                        + entry.getKey());

                break;
            }
        }
    }
}