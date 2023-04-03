package oop;

/*
 * Data Abstraction : it is the one of the pillar of OOP.
 * 
 *   - It is hiding the internal implementation and show the essential feature.
 *   
 *   example : 1) Fan
 *   		   2) Internal Organ i.e heart,kidney,etc
 *   		   3) Air
 *   
 *   Imp note : In Abstraction if the method is declared as abstract, then it is compulsory to implement the
 *   			abstract method in that class, which it is inheriting it.
 *   
 *   abstract class :
 *   
 *    - it is declared with a abstract keyword.
 *    
 *    - In abstract class, there should be compulsory abstract as well as non-abstract methods.
 *    
 *    - Abstract method is those methods, whose body are are not defined, they are having only 
 *      method declaration.
 *      
 *      e.g			abstract void show(); // abstract method or concrete method.
 *      
 *     - non-abstract method they are having a method body, it is also called as
 *       non-concrete method.
 *       
 *       e.g  void show()
 *       	  {
 *       		/statement
 *       	  }
 *      
 *      - We cannot create object of the abstract class.
 *      
 *      - Abstract class provides Partial Abstraction.
 *      
 *      - 
 *   
 **/

abstract class abs1{
	
	abstract void demo(); //abstract method
	
	void show()
	{
		System.out.println("Show method from class abs1");
	}
}

class abs2 extends abs1{
	
	void msg()
	{
		System.out.println("Message from Class abs2.");
	}

	
	void demo() {
		
		System.out.println("Demo Method implemented in Class abs2");
	}
}



public class AbstractionDemo {
	
	public static void main(String[] args) {
		
		abs2 a = new abs2();
		a.show();
		a.demo();
	
	}

}
