package com.filehandling;

import java.io.File;

public class FileDemo {
	
	public static void main(String[] args) {
		
		File f1 = new File("ser.txt");
		System.out.println(f1.canRead());
		System.out.println(f1.getAbsolutePath());
		System.out.println(f1.getFreeSpace());
		System.out.println(f1.getName());
		System.out.println(f1.isDirectory());
		System.out.println(f1.isFile());
		System.out.println(f1.length());		
	}

}
