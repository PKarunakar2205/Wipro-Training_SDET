package Assignment11;

import java.util.LinkedHashSet;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String str = "developer";

        LinkedHashSet<Character> set = new LinkedHashSet<>();

        for (int i = 0; i < str.length(); i++) {

            set.add(str.charAt(i));
        }

        String result = "";

        for (char ch : set) {

            result = result + ch;
        }

        System.out.println("Original String : " + str);
        System.out.println("After Removing Duplicates : " + result);
    }
}