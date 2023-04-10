package com.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/*
 * File : 
 * 
 *  - .txt file is common in every O.S
 *  - it is use to store the data.
 *  
 *  - FileInputStream -> use for Read Operation.
 *  - FileOutputStream -> use for Write Operation. -> it will create a new file or it will replace 
 *                                                    the existing file.
 *  
 *   
 */


public class FileInputOutputStream {
	
	public static void main(String[] args) throws Exception {
		
		FileOutputStream fos = new FileOutputStream("tops1.txt");
		String s = "This is file input/output stream example.";
		byte[] b = s.getBytes(); // String will now be converted Character by Character.
		
		fos.flush();
		fos.write(b);
		System.out.println("File Written Successful.");
		fos.close();
		
		FileInputStream fis = new FileInputStream("tops1.txt");
		int i;
		
		while((i=fis.read())!=-1) //-1 EOF 
		{
			System.out.print((char)i);
		}
		
	}

}
