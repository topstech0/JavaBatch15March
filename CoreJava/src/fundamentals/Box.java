package fundamentals;

import java.util.Scanner;

/*
 * Constructor : It is a special method, which is used to initialize the members of the class.
 * 
 * - Following are the Rules for the Constructor Utilization
 * 
 * 1) Constructor should be same as the class name.
 * 2) It does not contain Return Type.
 * 3) It is use the initialize the member of the class.
 * 
 * imp note: 4) It is Automatically called when the object of the class is created.
 * 
 * Types of Constructor
 * 
 * There are 3 types
 * 
 * 1) Default Constructor or Parameterless Constructor
 * 
 * syntax :
 * 
 * 			classname()
 * 			{
 * 				//statement
 * 			}
 * 
 * 2) Parameterized Constructor
 * 
 *  syntax :
 *  
 *  		classname(parameter1,parameter2....)
 *  		{
 *  			//Statement		
 *  		}
 *  
 *  3) Copy Constructor : Object as an Argument/Parameter is passed. 
 *  
 *  syntax : 
 *  
 *  		classname(classname objname)
 *  		{
 *  			//Statement
 *  		}
 *   
 */



public class Box {
	
	double width,height,depth;
	
	
	Box()
	{
		System.out.println("Default Constructor Called.");
		width = 5;
		height = 4;
		depth = 7;
	}
	
	Box(double w,double h,double d)
	{
		System.out.println("\nParameterized Constructor Called.");
		width = w;
		height = h;
		depth = d;
	}
	
	
	Box(Box o)
	{
		System.out.println("\nCopy Constructor Called.");
		width = o.width;
		height = o.height;
		depth = o.depth;
	}
	
	
	
	
	void volume()
	{
		System.out.println("Volume of Box : "+(width*height*depth));
	}
	
	
	
	public static void main(String[] args) {
		
		Box obj1 = new Box();//Default Constructor Called
		obj1.volume();
		
		Box obj2 = new Box(4,6,9); //Parameterized Constructor Called.
		obj2.volume();
		
		Box obj3 = new Box(obj1);
		obj3.volume();
		
	}

}
