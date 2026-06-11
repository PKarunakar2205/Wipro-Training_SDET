package File_Handling;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Write_file {

    public static void main(String[] args) throws IOException {

        // Create file
        File file = new File("demo.txt");
        file.createNewFile();

        // Write into file
        FileWriter wr = new FileWriter("demo.txt");
        wr.write("Let's learn Java Programming\n");
        wr.write("Selenium Automation\n");

        // Close writer
        wr.close();
        Scanner sc=new Scanner(file);
         while(sc.hasNextLine()) {
        	 System.out.println(sc.nextLine());
         }
         sc.close();
        

        
    }
}