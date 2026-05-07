package Assignment10;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AppendFile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text to append: ");
        String input = sc.nextLine();

        try {
            
            FileWriter fw = new FileWriter("input.txt", true);

            fw.write(input);
            fw.write(System.lineSeparator()); 

            fw.close();

            System.out.println("Data appended successfully!");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        
    }
}