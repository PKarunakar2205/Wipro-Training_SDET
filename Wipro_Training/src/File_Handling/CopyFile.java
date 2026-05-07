package File_Handling;
import java.io.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("Test.txt");
        FileWriter fw = new FileWriter("demo.txt");

        int ch;
        while ((ch = fr.read()) != -1) {
            fw.write(ch);
        }

        fr.close();
        fw.close();

        System.out.println("File copied");
    }
}