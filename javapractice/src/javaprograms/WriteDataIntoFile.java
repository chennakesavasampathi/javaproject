package javaprograms;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoFile {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("D:\\resumes\\test.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		 
		bw.write("chennakesava");
		bw.write("chennakesava");
		bw.write("chennakesava");
		bw.write("chennakesava");
		System.out.println(" finished !!");
		bw.close();

	}

}
