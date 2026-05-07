package Assignment10;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadJavaLines {
    public static void main(String[] args) {

        String filePath = "Test.txt";   

        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;

            while ((line = br.readLine()) != null) {

                
                if (line.contains("Java")) {
                    System.out.println(line);
                }
            }

            br.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
