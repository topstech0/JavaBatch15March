package fundamentals;
 
/*
 * 	Variables : It is a name at memory location, which stores value of different types.
 * 
 * 			Naming Convention for Variables.
 * 			
 * 			1) it should not start with a digit.
 * 			2) No special characters allowed.except _
 * 			3) No whitespace e.g first name;
 * 			4) it is Case Sensitive.
 * 
 * 			e.g-      a is different and A is different.
 * 
 * 			because they follow ascii rule.
 * 			ascii (American Standard code for information interchange)
 * 	
 * 
 * 	Datatypes
 * 
 * There are 2 Datatypes
 * 
 * 1) Primitive datatype
 * 2) Non-primitive datatype
 * 
 * 1) Primitive (Built in Datatypes)
 * 
 * 	datatype		size			class
 * 
 * - byte			1byte			Byte
 * - short			1byte			Short
 * - char			1byte			Character
 * - int			4byte			Integer
 * - float			4byte			Float
 * - double			8byte			Double
 * - long			8byte			Long
 *  -boolean		true/false		Boolean
 *  
 *  
 *  2) Non-Primitive/Derived Class/ User Defined Types
 *  
 *  1) String
 *  2) Array
 *  3) class 
 * 
 */



public class Test1 {
	
	
	
	 public static void main(String[] args) {
		
		int a=10,b=20;
		int A = 54;
		System.out.println("Addition : "+(A+b));
		System.out.println("Subtraction : "+(a-b));
		System.out.println("Multiplcation : "+(a*b));
		System.out.println("Division : "+((float)a/b));
		
	}
	
	
}


