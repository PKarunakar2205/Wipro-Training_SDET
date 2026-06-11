package File_Handling;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Append_file {

    public static void main(String[] args) throws IOException {

        // Create file
        File f1 = new File("Append.txt");
        f1.createNewFile();

        // Append data (true = append mode)
        FileWriter wt = new FileWriter("Append.txt", true);

        wt.write("\nThis is appended text");

        wt.close();

//        System.out.println("Data appended successfully.");
    }
}