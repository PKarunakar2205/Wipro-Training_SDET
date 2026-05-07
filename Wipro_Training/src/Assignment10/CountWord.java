package Assignment10;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountWord {
    public static void main(String[] args) {

        String filePath = "count.txt";   
        String targetWord = "cricket";

        int count = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;

            while ((line = br.readLine()) != null) {

                String[] words = line.split("\\s+");

                for (String word : words) {
                    if (word.equals(targetWord)) {
                        count++;
                    }
                }
            }

            br.close();

            System.out.println("Occurrences of '" + targetWord + "': " + count);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}