package oop;

/*
 * interface : it is syntactically similar like a class, but it is not a class.
 * 
 * -we use interface keyword.
 * 
 * syntax: 
 * 
 * 	interface interface-name
 * {
 * 	// abstract methods only.
 * }
 *  * 
 * - Since it is not a class, so we do not create the object of interface.
 *  
 * - In interface all Methods are Abstract.
 * 
 *  Imp note - When there are abstract methods in interface, so it is compulsory to implement those methods
 *             in that class which it is inheriting it.
 *             
 * In interface we make use of implements keyword for inheritance.
 * 
 * - interface inheritance is also possible.
 * 
 * - One class cannot extend more than one class, but one interface can implement more than one interface. 
 * 
 * - interface provides Full Abstraction.
 *  
 *  
 *  - If we want to create the non- abstract method then we can declare the method as static 
 *    and it can be accessed only through the interface name. 
 */

interface ifs1
{
	 abstract void meth1(); // unimplemented method.
}

interface ifs2 
{
	abstract void meth2();
}

class PQR implements ifs1,ifs2
{
	void show()
	{
		System.out.println("Show Method from class PQR.");	
		
	}
	
	public void meth1() {
		System.out.println("Method1 is implemented in class PQR.");		
	}

	@Override
	public void meth2() {
		System.out.println("Method2 is implemented in class PQR.");
		
	}	
}

public class InterfaceDemo {

	public static void main(String[] args) {
		
		//ifs1 n = new ifs1();
		
		PQR obj1 = new PQR();
		obj1.show();
		obj1.meth1();
		obj1.meth2();
		
	}
}
