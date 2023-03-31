package keywords;

/*
 * In Java, we have 4 powerful keywords
 * 
 * 1) super : It will be only used in the sub-class/derived class/child class.
 * 	
 * 2) this : it is a keyword which refers to the current class members.
 * 
 * 3) static : it is mainly used for Common Memory Management.
 *  
 * ========================================== 
 *  
 * 4) final : it is a keyword, which can be declared to variable, method and class.
 * 
 * - When we declare a variable as final, we cannot change the value throughout the program.
 * 
 * 	e.g final int a;
 * 
 * - When we declare a Method as final, we cannot override the method.
 * 
 * - When we declare the class as final, we cannot inherit the class.
 * 
 *  
 * 
 */


class final1{
	
	final double pi =3.14;
	
	//final void show()
	void show()
	{
		//pi=3.15;
		System.out.println("final 1 class method and PI = "+pi);
	}
	
}

//final class final2 extends final1{
class final2 extends final1{
	
	void show()
	{
		super.show();
		System.out.println("final2 class method and PI = "+pi);
	}
}
class final3 extends final2
{
	void show()
	{
		super.show();
		//pi=3.14;
		System.out.println("final3 class method and PI = "+pi);
	}
}



public class FinalDemo {
	
	public static void main(String[] args) {
		
		//final1 f1 = new final1();
		//f1.show();
		
		//final2  f2 = new final2();
		//f2.show();
		
		final3 f3 = new final3();
		f3.show();
		
		
	}

}





