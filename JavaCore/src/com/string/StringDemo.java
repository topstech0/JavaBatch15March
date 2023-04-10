package com.string;

/*
 * String : It is a collection of characters.
 * 
 * - In Java, Strings are Immutable i.e Once the String is initialized, it cannot be modified.
 * - Performance of String is slow when the Concatenation is performed.
 * 
 * 
 * 
 */


public class StringDemo {

	public static void main(String[] args) {
		
		String s1 = new String("This is Tops Technologies");
		
		System.out.println("Original String is : "+s1);
		System.out.println("Length of String is : "+s1.length());
		
		System.out.println("String in uppercase : "+s1.toUpperCase());
		System.out.println("String in lowercase : "+s1.toLowerCase());
		System.out.println("Substring with beginIndex: "+s1.substring(7));
		System.out.println("Substring with begin and endIndex : "+s1.substring(3, 16));
		System.out.println("String at Character : "+s1.charAt(5));
		
		
	}
	
}
