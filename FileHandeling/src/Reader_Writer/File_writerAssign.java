package Reader_Writer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File_writerAssign {

	static String sd;

	public void WriteData(int rows) throws IOException {

		File f = new File("../FileHandeling/FileOutput.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter br = new BufferedWriter(fw);
		System.out.println("write here");
		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= rows; i++) {
			sd = sc.nextLine();
			br.write(sd);
			br.newLine();

		}

		br.close();
	}

	public static void main(String[] args) throws IOException {
		
		File_writerAssign obj = new File_writerAssign();
		obj.WriteData(5);
		

	}

}
