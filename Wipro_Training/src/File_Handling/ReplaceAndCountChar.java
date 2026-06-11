package File_Handling;

import java.io.*;

public class ReplaceAndCountChar {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("Test.txt"));
        String data = "", line;
        int chars = 0;

        while ((line = br.readLine()) != null) {
            line = line.replace("Java", "Python");
            chars += line.length();
            data += line + "\n";
        }
        br.close();

        FileWriter fw = new FileWriter("Test.txt");
        fw.write(data);
        fw.close();

        System.out.println("Characters: " + chars);
        System.out.println("Word replaced");
    }
}