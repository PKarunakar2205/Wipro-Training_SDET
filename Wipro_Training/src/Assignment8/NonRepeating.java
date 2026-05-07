package Assignment8;

import java.util.HashMap;

public class NonRepeating {
    public static void main(String[] args) {

        String str = "programming";
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        System.out.print("Non-repeating characters: ");
        for (char ch : str.toCharArray()) {
            if (map.get(ch) == 1) {
                System.out.print(ch + " ");
            }
        }
    }
}


