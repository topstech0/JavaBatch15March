package exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Exception : It is an abnormal situation that arises at the Runtime of the 
 * 			   program is called an Exception.
 * 
 * 				e.g if you have written a 100 lines of code, and the exception is raised at
 *  				the 3rd line, it will not execute the remaining lines of code.
 * 
 * 
 * There are 2 types of Exception
 * 
 *  1) Checked Exception: This kind of exception are handled at Compile Time.
 *  
 *     					 e.g throw, throws	
 *  
 *  2) Unchecked Exception : This kind of exception are handled at Run Time.
 *  	
 *  					e.g try,catch,finally
 *  
 *  
 *  To handle the exception, java has provided with 5 keywords
 *  
 *  1) try
 *  2) catch
 *  3) finally
 *  4) throw
 *  5) throws
 *  
 * 
 * 
 * 
 * try : it is a block of code/content
 * 		- try will never be alone.
 * 		- it will have one minimum catch block.
 * 		-try can have more than one catch block.
 * 
 * catch : it is a block of code, when the exception is raised it catches the exception and handles it.
 * 
 * finally : it is a block of code,it will be executed any how even if the exception is not generated.
 * 
 * 
 * 
 * 	
 * 
 */

public class ExceptionDemo {
	
	public static void main(String[] args) {
		
		System.out.println("Start Code");
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter A : ");
			int a = sc.nextInt();
			System.out.println("Enter B : ");
			int b = sc.nextInt();
			float c = (a/b);
			System.out.println("Division : "+c);
			//int arr[] = {1,2,3};
			//System.out.println(arr[3]);
			System.out.println("End Code");
		}
		/*catch (ArithmeticException e) {
			System.out.println("Exception Caught "+e);
		}
		catch (InputMismatchException e) {
			System.out.println("Exception Caught "+e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception Caught "+e);
		}
		*/
		catch (Exception e) {
			System.out.println("Exception Caught "+e);
		}
		finally
		{
			System.out.println("Finally block is executed.");
		}
		
	
		
		
		
	}

}
