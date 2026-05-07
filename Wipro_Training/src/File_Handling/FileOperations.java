package File_Handling;

import java.io.*;
import java.util.*;

public class FileOperations {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("1.Count Lines");
        System.out.println("2.Replace Word");
        System.out.println("3.Count Words");
        System.out.println("4.Count Characters");
        System.out.println("5.Copy File");
        System.out.println("6.Largest Word");
        System.out.println("7.Combine Files");
        System.out.println("8.Reverse Read");

        System.out.print("Enter choice: ");
        int ch = sc.nextInt();

        switch (ch) {

            case 1: // Count lines
                BufferedReader br1 = new BufferedReader(new FileReader("Test.txt"));
                int lines = 0;
                while (br1.readLine() != null) lines++;
                System.out.println("Lines = " + lines);
                br1.close();
                break;

            case 2: // Replace word
                BufferedReader br2 = new BufferedReader(new FileReader("Test.txt"));
                String line;
                while ((line = br2.readLine()) != null) {
                    System.out.println(line.replace("Java", "Python"));
                }
                br2.close();
                break;

            case 3: // Count words
                BufferedReader br3 = new BufferedReader(new FileReader("Test.txt"));
                int words = 0;
                while ((line = br3.readLine()) != null) {
                    words += line.split(" ").length;
                }
                System.out.println("Words = " + words);
                br3.close();
                break;

            case 4: // Count characters
                BufferedReader br4 = new BufferedReader(new FileReader("Test.txt"));
                String l = br4.readLine();
                System.out.println("Characters = " + l.length());
                br4.close();
                break;

            case 5: // Copy file
                FileReader fr = new FileReader("Test.txt");
                FileWriter fw = new FileWriter("Copy.txt");
                int c;
                while ((c = fr.read()) != -1) fw.write(c);
                System.out.println("Copied");
                fr.close();
                fw.close();
                break;

            case 6: // Largest word
                BufferedReader br6 = new BufferedReader(new FileReader("Test.txt"));
                String largest = "";
                while ((line = br6.readLine()) != null) {
                    for (String w : line.split(" ")) {
                        if (w.length() > largest.length()) largest = w;
                    }
                }
                System.out.println("Largest = " + largest);
                br6.close();
                break;

            case 7: // Combine files
                FileReader f1 = new FileReader("File1.txt");
                FileReader f2 = new FileReader("File2.txt");
                FileWriter out = new FileWriter("Output.txt");

                while ((c = f1.read()) != -1) out.write(c);
                while ((c = f2.read()) != -1) out.write(c);

                System.out.println("Files Combined");
                f1.close();
                f2.close();
                out.close();
                break;

            case 8: // Reverse read
                RandomAccessFile raf = new RandomAccessFile("Test.txt", "r");
                for (long i = raf.length() - 1; i >= 0; i--) {
                    raf.seek(i);
                    System.out.print((char) raf.read());
                }
                raf.close();
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}