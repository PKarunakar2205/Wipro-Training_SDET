package File_Handling;

import java.io.*;

public class CountLineWord {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("Test.txt"));

        int lines = 0, words = 0;
        String line;

        while ((line = br.readLine()) != null) {
            lines++;
            words += line.split(" ").length;
        }

        br.close();

        System.out.println("Lines: " + lines);
        System.out.println("Words: " + words);
    }
}