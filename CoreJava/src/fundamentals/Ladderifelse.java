package fundamentals;

import java.util.Scanner;

public class Ladderifelse {
	
	public static void main(String[] args) {
		
		int rollno;
		String name;
		int p,c,m,total;
		double per;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Roll.No : ");
		rollno = sc.nextInt();
		System.out.print("Enter Name : ");
		name= sc.next();
		System.out.print("Enter Physics Marks : ");
		p = sc.nextInt();
		System.out.print("Enter Chemistry Marks : ");
		c = sc.nextInt();
		System.out.print("Enter Maths Marks : ");
		m = sc.nextInt();
		total = p+c+m;
		System.out.println("Total Marks Obtained : "+total+" / 300");
		per = (double)total/3;
		System.out.println("Percentage is :"+per);
		
		if(per>=75)
		{
			System.out.println("Distinction Class");
		}
		else if(per>=60)
		{
			System.out.println("First Class");
		}
		else if(per>=50)
		{
			System.out.println("Second Class");
		}
		else if(per>=40)
		{
			System.out.println("Pass Class");
		}
		else
		{
			System.out.println("Fail!");
		}
		
		
		
	}

}
