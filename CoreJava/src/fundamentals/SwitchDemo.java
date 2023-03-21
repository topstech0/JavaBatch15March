package fundamentals;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Value of A and B : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("A = "+a+", B = "+b);
		System.out.println("\nPress 1. for Addition\nPress 2. for Subtraction\nPress 3. for Multiplication\nPress 4. for Division");
		System.out.println("Enter your Choice ? ");
		int choice = sc.nextInt();
		
		switch(choice)
		{
		case 1:System.out.println("Addition : "+(a+b));
				break;
		case 2:System.out.println("Subtraction : "+(a-b));
				break;
		case 3:System.out.println("Multiplication : "+(a*b));
				break;
		case 4:System.out.println("Division : "+((float)a/b));
				break;
		default:System.out.println("Invalid Choice");
				break;
		}
		
		
	}
}
