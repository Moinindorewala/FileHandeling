package Reader_Writer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyPast {

    public static void main(String[] args) throws IOException {
	
    	

    	File f = new File("../FileHandeling/FileInput.txt");
    	FileReader fr = new FileReader(f);
    	BufferedReader br = new BufferedReader(fr);
    	
    	File f1 = new File("../FileHandeling/FileOutput.txt");
    	FileWriter fr1 = new FileWriter(f1);
    	BufferedWriter br1 = new BufferedWriter(fr1);
    	
    	int c;
    	while ((c = br.read()) != -1) {  
    		   br1.write(c);  
    		  }  
    		  System.out.println("Copied file Successfully");  
    		  br.close();  
    		  br1.close();  
    		 } 
	}
     	
    
