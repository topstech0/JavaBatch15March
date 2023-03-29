package oop;

/*
 * Polymorphism : It is a combination of Multiple Forms.
 * 
 * Poly -> Many  and Morphism means forms.
 * 
 * There are 2 Types of Polymorphism
 * 
 * 1) Compile Time Polymorphism or Static Polymorphism or Early Binding
 * 
 * 		e.g Method Overloading 			
 * 
 * 2) Run Time Polymorphism or Dynamic Polymorphism or Late Binding
 * 
 * 		e.g Method Overriding
 * 
 * 
 * 
 * Method Overloading :  
 * 
 *  -Rules
 *  
 *  1) Same Method Name
 *  2) Different Parameters
 *  3) Different Return Types.
 * 
 * 
 * 
 * 
 * 
 */

class MODemo{
	
	void add()
	{
		int a=10,b=20;
		System.out.println("Add : "+(a+b));
	}
	
	void add(int a, int b)
	{
		System.out.println("Value from Main : "+(a+b));
	}
	
	int add(int a,int b,int c)
	{
		return a+b+c;
	}
	
	
}


public class PolymorphismDemo {
	
	public static void main(String[] args) {
		
		MODemo obj1 = new MODemo();
		obj1.add();
		obj1.add(54,52);
		//obj1.add(41); compile time problem
		//System.out.println("Add : "+obj1.add(40, 10, 5));
		int res = obj1.add(40, 19, 5);
		if(res%2==0)
		{
			System.out.println("Addition Result is Even. i.e "+ res);
		}
		else
		{
			System.out.println("Addition Result is Odd. i.e "+res);
		}
		
	}

}
