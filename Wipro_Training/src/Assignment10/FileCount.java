package Assignment10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileCount {

    public static void main(String[] args) {

        String filePath = "sample.txt";  

        int lines = 0;
        int words = 0;
        int characters = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;

            while ((line = br.readLine()) != null) {
                lines++;

               
                characters += line.length();

                
                String[] wordList = line.trim().split("\\s+");
                if (line.trim().length() > 0) {
                    words += wordList.length;
                }
            }

            br.close();

            System.out.println("Number of lines: " + lines);
            System.out.println("Number of words: " + words);
            System.out.println("Number of characters: " + characters);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}