package fundamentals;

import java.util.Scanner;

/*
 * Conditional Statements : 
 * 
 * Condition : it is a boolean value. it will evaluate to either true/false
 * 
 *1) simple if
 *
 *	Syntax: 
 *			if(condition)
 *			{
 *				//statements
 *			}
 *
 *2) if/else
 *
 *	syntax: if(condition)
 *			{
 *				//statements
 *			}
 *			else
 *			{
 *				//statement
 *			}
 *
 *3) nested if/else
 *
 * syntax : if(condition)
 * 			{
 *				if(condition)
 *				{	
 *					//statements
 *				}
 *				else
 * 				{
 * 					//statements	
 * 				}
 * 			}
 * 			else
 * 			{
 * 				if(condition)
 *				{	
 *					//statements
 *				}
 *				else
 * 				{
 * 					//statements	
 * 				} 				
 * 			}
 * 
 * 4) Ladder if/else
 * 
 * Syntax:
 * 
 * 			if(condition)
 * 			{
 * 				//statements
 * 			}
 * 			else if(condition)
 * 			{
 * 				//statements
 * 			}
 * 			else if(condition)
 * 			{
 * 				//statements
 * 			}
 * 			else if(condition)
 * 			{
 * 				//statements
 * 			}
 * 			else
 * 			{
 * 				//statements
 * 			}
 * 
 *
 *
 * 
 *2) if/else
 *3) nested if/else
 *4) ladder if/else
 * 			
 * 
 * 
 * 
 * 
 * 
 */




public class Conditional {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Value of A: ");
		int a = sc.nextInt();		
		System.out.print("Enter Value of B: ");
		int b = sc.nextInt();
		System.out.print("Enter Value of C: ");
		int c = sc.nextInt();
		
		System.out.println("Value of A = "+a+", B = "+b+", C = "+c);
		//System.out.println("Enter Name : ");
		//String name = sc.next();		
		//System.out.println("Value of B : "+b);		
		//System.out.println("Addition : "+ (a+b));
		//System.out.println("Name : "+ name);
		
		/*
		if(a>b)
		{
			System.out.println(a+" is Greater");
		}
		else
		{
			System.out.println(b+"is Greater");
		}
		*/
		
		if(a>b)
		{
			if(a>c)
			{
				System.out.println(a +" is Greater");
			}
			else
			{
				System.out.println(c+" is Greater");
			}
		}
		else
		{
			if(b>c)
			{
				System.out.println(b+" is Greater");
			}
			else
			{
				System.out.println(c+" is Greater");
			}
		}
		
		
	}

}
