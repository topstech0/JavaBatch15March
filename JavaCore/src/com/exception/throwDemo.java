package com.exception;

import java.util.Scanner;

/*
 * /* throw : it is a keyword and not a block of code.
 * 
 *  - throw is used whenever you want to throw the exception explicitly.
 *  
 *  Rules of throw keyword.
 *  
 *  1) it is written inside some block of code/inside the method.
 *  2) you cannot write any statement after the throw keyword is used.
 *  3) it is used with the object creation of the particular class. 
 * 
 */


public class throwDemo {

	public static void demo()
	{
	int x;
	Scanner sc = new Scanner(System.in);
				
	try {
		System.out.println("Enter X : ");
		 x = sc.nextInt();
		 if(x>0)
			{
				System.out.println("Square of X  is "+(x*x));
			}
			else
			{
				throw new Exception("Please Enter +ve Value.");										
			}
	} catch (Exception e) {
		System.out.println(e);
		demo();
	}
			
}
	

public static void main(String[] args) {
	demo();
}
}
