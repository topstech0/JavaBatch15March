package oop;

import java.util.Scanner;

/*
 * Inheritance : It is acquiring the properties of base class/parent class into the
 * 				 derived class/child class.
 * 
 * Simple and practical :  It is creating a new class from an already 
 * 						   existing class.
 * 
 * Imp note				:	In Inheritance, the object will always be created
 * 							of derived class.
 * 
 * Features 			:  Code Reusability
 * 
 * There are 5 types of Inheritance.
 * 
 * 1) Single-level Inheritance
 * 2) Multi-level Inheritance
 * 3) Multiple-level Inheritance
 * 4) Hierarchical-level Inheritance
 * 5) Hybrid-level Inheritance
 * 
 *  Java supports only 3 types of Inheritance.
 *  
 *  1) Single-level Inheritance
 *  2) Multi-level Inheritance
 *  3) Hierarchical-level Inheritance
 *  
 *  extends keyword is used when you want to access the property of base class into derived class.
 * 
 * Why Java does not support Multiple Inheritance  and Hybrid Inheritance?
 * 
 * - Because it generates an Ambiguity issue.
 * -In Java, there is an alternative for Multiple Inheritance
 *  which is called as [Interface]
 *  
 *  -Hybrid-level Inheritance does not support Inheritance,
 *  because it generates Deadly Diamond of Death (DDOD).
 * 
 * 
 * 
 * 
 */


//Single-level Inheritance

class A
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


class B extends A
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
class C extends B
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






public class InheritanceDemo {

	public static void main(String[] args) {
		/*A obj1 = new A();
		obj1.getA();
		obj1.showA();
		*/
		C obj2 = new C();
		obj2.getA();
		obj2.getB();
		obj2.getC();
		obj2.showA();
		obj2.showB();
		obj2.showC();
		
		
	}
}




