package File_Handling;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read_file {
    public static void main(String[] args) {

        try {
            File file = new File("sample.txt");
            System.out.println(file);

            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }

            sc.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}