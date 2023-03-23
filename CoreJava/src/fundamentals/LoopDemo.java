package fundamentals;

import java.util.Scanner;

/*
 * Loop : it is a process which repeats again and again until the condition does not becomes false.
 * 
 * 1) while loop
 * 2) do..while loop
 * 3) for loop
 * 
 * - while loop
 * 
 * syntax :
 * 				//initialization
 * 				
 * 				while(condition)
 * 				{
 * 					statement
 * 					//updation
 * 				}
 * 		
 * 
 * -It is called as Entry Controlled Loop.
 * -Because the condition is checked first, then the body is executed.
 * -No semi-colon after condition.
 * 
 * 2) do..while loop
 * 
 * syntax:
 * 			//initialization
 * 
 * 			do
 * 			{
 * 				//statement
 * 				//updation
 * 			} 
 * 			while(condition);
 * 
 * 
 * - It is called as Exit Controlled Loop.
 * - Because the body is executed first and then the condition is checked.
 * - It will execute the body atleast once, even if the condition is false.
 * - Semicolon after condition. 
 * 
 * 3) For Loop: (All in single Line)
 * 
 * 
 * syntax:
 * 
 * 			for(initialization;condition;updation)
 * 			{
 * 				//statement	
 * 			}
 * 
 */

public class LoopDemo {

	public static void main(String[] args) {

		int i = 1; // initialization

		/*
		 * while(i<10) //condition { System.out.println(i); i++; }
		 */

		/*	
		do {
			System.out.println(i);
			i++;
		} while (i >= 10);
		*/
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number.");
		int n = sc.nextInt();
		
		for(int j=1;j<=10;j++)
		{
			System.out.println(n+" X "+j+" = "+(n*j));
		}
		*/
		
		
		//Pattern 1
		
		/*for(i=1;i<=10;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			
			
			System.out.println();
		}
		*/
		
		//Pattern 2 and Pyramid
		for(i=1;i<=10;i++)
		{
			for(int sp=1;sp<=10-i;sp++)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(" *");
			}
			System.out.println(); 
		}
		

	}

}
