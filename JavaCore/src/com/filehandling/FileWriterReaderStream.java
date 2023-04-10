package com.filehandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 
 * FileWriter class : To Write
 * FileReader class : To Read
 * 
 * 
 */

public class FileWriterReaderStream {
	
	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("tops2.txt");
		String s1 = "This is file writer/reader demo.";
		fw.flush();
		fw.write(s1);
		fw.close();
		System.out.println("File Written Successful.");
		
		
		FileReader fr = new FileReader("tops2.txt");
		int i;
		
		while((i=fr.read())!=-1)
		{
			System.out.print((char)i);
		}
		
		
		
	}

}
