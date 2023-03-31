package keywords;

import java.util.Scanner;

/*
 * static : it is a keyword which is declared to variable,method,class
 * 
 *  - all static members can only be accessed in static environment, 
 *   if the method is declared as static and can be accessed by its methodname.
 *   
 *   -  if it is not static then it can only be accessed with the object of the class.
 *   
 *   - Static Block are initialized before Main Method.
 *   
 *   - It is use for Common Memory Management.
 * 
 * 
 * 
 */


public class StaticDemo {
	
	static int a; // non-static member
		
	void setA()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A : ");
		a = sc.nextInt();
	}
	
	void getA()
	{
		System.out.println("A : "+a);
	}
	
	public static void main(String[] args) {
	
		StaticDemo s1 = new StaticDemo();
		StaticDemo s2 = new StaticDemo();
		StaticDemo s3 = new StaticDemo();
	
		s1.setA();
		s2.setA();
		s3.setA();
		
		s1.getA();
		s2.getA();
		s3.getA();
	}

}
