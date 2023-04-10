package com.string;

/*
 * StringBuffer class : This class is Mutable Class, i.e The String can be modified.
 * 
 *  - Performance of StringBuffer as compared to String class is faster 
 *    when the Concatenation is performed.
 * 
 * 
 */

public class StringBufferDemo {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("This is Rakesh Kharva");
		
		System.out.println("Original String : "+sb);
		System.out.println("String Length : "+sb.length());
		
		sb.insert(14, " Vikram ");
		System.out.println("Original String : "+sb);
		System.out.println("String Length : "+sb.length());
		
		sb.append(" from Tops Technologies");
		System.out.println("Original String : "+sb);
		System.out.println("String Length : "+sb.length());
		
		sb.delete(10, 16);
		System.out.println("Original String : "+sb);
		System.out.println("String Length : "+sb.length());
	
	}
	
}
