package com.generics;

/*
 * Generic : It provides the Common Type.
 * 
 * 			- It also provides the Type Safety.
 * 
 *  - At Runtime if you create a one type method and if you try t0 pass different values
 *  to that method , the method will only take that type of values,
 *  
 *   - To avoid this , if you want to pass multiple types , you can make use of generics.
 *   
 *   -Like in C++ , we have Template.
 *   
 *   In Java, it provides the predefined Entity Class i.e <E>
 *   
 *    -Inside the generic you cannot pass the Primitive Types.
 *    
 *    - Only Reference types are allowed in Generics.
 *    
 *    e.g Class. <E>
 *    
 *    
 *    
 * 
 * 
 * 
 */




public class GenericDemo {
	
	public static <E> void printArray(E[] inputArray)
	{
		for(E e : inputArray)
		{
			System.out.println(" "+e);
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
	
		Integer intArray[] = {10,20,30,40,50};
		Character charArray[] = {'a','e','i','o','u'};
		Double doubleArray[] = {1.1,2.2,3.3,4.4,5.5};
		Float floatArray[] = {10.1f,20.2f,30.3f,40.4f,50.5f};
		
		System.out.println("Passing Integer Array : ");
		printArray(intArray);
		System.out.println("Passing Character Array : ");
		printArray(charArray);
		System.out.println("Passing Double Array : ");
		printArray(doubleArray);
		System.out.println("Passing Float Array : ");
		printArray(floatArray);
		
		
		
		
	}

}
