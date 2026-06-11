package File_Handling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Buf_Reader {

	public static void main(String[] args) throws IOException {
		
		File f=new File("Sample wipro.txt");
		
		f.createNewFile();
		
		
	BufferedWriter fr=new BufferedWriter(new FileWriter("Sample wipro.txt"));
	
	fr.write("Hello mam,Had a Great Learning with you");
	
	fr.flush();
	
	fr.close();
	
	BufferedReader br=new BufferedReader(new FileReader("Sample wipro.txt"));
		
	String l1;
		
		while((l1=br.readLine())!=null) {
			System.out.println(l1);
	}
		br.close();

	}

}
