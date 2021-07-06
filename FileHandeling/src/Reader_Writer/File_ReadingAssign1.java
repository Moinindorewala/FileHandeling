package Reader_Writer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class File_ReadingAssign1 {

	static int start, end ;

	public void ReadData() throws IOException {
		File f = new File("../FileHandeling/FileInput.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		Scanner sc = new Scanner(System.in);
		System.out.println("Start range");
		start = sc.nextInt();
		System.out.println("End Range");
		end = sc.nextInt();

		String text;
		int line=0;
		while ((text = br.readLine()) != null)
		{
			line=line+1;
			if((line>=start) && (line<=end))
			{
				System.out.println(text);
			}
		}
					
	}

	public static void main(String[] args) throws IOException {

		
		File_ReadingAssign1 obj = new File_ReadingAssign1();
		obj.ReadData();


	}

}
