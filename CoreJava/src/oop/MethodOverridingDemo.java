package oop;

/*
 * 
 * Method Overriding : It is an Example of Run Time Polymorphism
 * 
 * Rules.
 * 
 * - Same Method Name
 * - Same Parameters 
 * - Same Return Type.
 * 
 * - The whole Method signature is same.
 * 
 * 
 */


// Constructor Chaining
class X
{
	X()
	{
		System.out.println("X's Constructor Called.");
	}
	
	void show()
	{
		System.out.println("Show Method from X.");
	}
	
}

class Y extends X
{
	Y()
	{
		System.out.println("Y's Constructor Called.");
	}
	
	void show()
	{
		super.show();
		System.out.println("Show Method from Y.");
	}
}

class Z extends Y
{
	Z()
	{
		System.out.println("Z's Constructor Called.");
	}
	
	void show()
	{
		super.show();
		System.out.println("Show Method from Z.");
	}
}


public class MethodOverridingDemo {

	public static void main(String[] args) {
		Z obj1 = new Z();
		obj1.show();
		
	}
}
