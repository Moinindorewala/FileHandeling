package Reader_Writer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class File_readindAssign {
	String text ;
	int line;
	static int sd;

	public void ReadData() throws IOException {
		File f = new File("../FileHandeling/FileInput.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		for (line = 1; line <= sd; line++) {
			if (line == sd) {
				text = br.readLine();
				System.out.println(text);
			} else {
				br.readLine();
			}
		}

	}

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter line number");
		sd = sc.nextInt();
		File_readindAssign rd = new File_readindAssign();
		rd.ReadData();

	}

}
