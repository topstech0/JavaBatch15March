package oop;

import java.util.Scanner;

class A1
{
	int a; //Data-variable
	
	Scanner sc= new Scanner(System.in);
	
	void getA() //Member Functions
	{
		System.out.println("Enter A : ");
		a = sc.nextInt();
	}
	
	void showA()
	{
		System.out.println("A : "+a);
	}

}


class B1 extends A1
{
	int b;
	Scanner sc = new Scanner(System.in);
	
	void getB()
	{
		System.out.println("Enter B : ");
		b = sc.nextInt();
	}
	
	void showB()
	{
		System.out.println("B : "+b);
	}
	
	
}

//Multi-level Inheritance
class C1 extends A1
{
	int c;
	Scanner sc = new Scanner(System.in);
	
	void getC()
	{
		System.out.println("Enter C : ");
		c = sc.nextInt();
	}
	
	void showC()
	{
		System.out.println("C : "+c);
	}
}



public class HierarchicalInheritance {
	
	public static void main(String[] args) {
		
		B1 b = new B1();
		b.getA();
		b.getB();
		
		C1 c = new C1();
		c.getC();

		b.showA();
		b.showB();
		c.showC();
	}

}
