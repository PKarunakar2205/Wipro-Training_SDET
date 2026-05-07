package File_Handling;

import java.io.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LargestAndReverse {
    public static void main(String[] args) throws Exception {

        // Largest word
        BufferedReader br = new BufferedReader(new FileReader("Test.txt"));
        String line, largest = "";

        while ((line = br.readLine()) != null) {
            String[] words = line.split(" ");
            for (String w : words) {
                if (w.length() > largest.length()) {
                    largest = w;
                }
            }
        }
        br.close();

        System.out.println("Largest word: " + largest);

        // Reverse read
        RandomAccessFile raf = new RandomAccessFile("Test.txt", "r");
        long len = raf.length();

        System.out.println("\nReverse content:");
        for (long i = len - 1; i >= 0; i--) {
            raf.seek(i);
            System.out.print((char) raf.read());
        }

        raf.close();
    }
}