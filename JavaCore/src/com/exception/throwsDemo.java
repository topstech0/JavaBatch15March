package com.exception;

import java.util.Scanner;

/* throws : it is a keyword which is used in checked exception.
 * 
 * 
 * -> throws always works with method signature/declaration.
 * 
 * e.g public void demo() throws ArithmeticException,... 
 * 	{
 * 	}
 * 
 * if I am using throws, then I will not use try,catch block
 * 
 * - throws is an alternative for try/catch block.
 * - throws handle Multiple Exception
 * - throws works with class.
 * 
 * 
 * 
 * 
 */



public class throwsDemo {
	
	public static void demo() throws Exception
	{
		int x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter X : ");
		x= sc.nextInt();
		
		if(x>0)
		{
			System.out.println("Square of X : "+(x*x));
		}
		else
		{
			throw new Exception("Please Enter +ve value");
		}
		
	}
	
	
	
	public static void main(String[] args) {
		
		try {
			demo();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
