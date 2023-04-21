package Multithreading;

/*
 * Thread : The smallest unit of the program is called a Thread.
 * 
 * 		  -At a time only single thread can execute.
 * 
 * Java provides you the inBuilt Thread Class.
 * 
 * Inside the Thread there are 3 Default arguments.
 * 
 * 1st Argument : It is the name of the Thread.
 * 				 - Default name of the Thread is main.
 * 
 * 
 * 2nd Argument : It is the Priority of the Thread.
 * 
 * Inside this there are 3 Priorities.
 * 
 * Norm_Priority : Value is 5.
 * Min_Priority : Value is 1.
 * Max_Priority : Value is 10.
 * 
 * 3rd Argument : It is the group name.
 * 
 * 				: The Default group name of the Thread is main.
 * 
 * 
 */




public class ThreadDemo {
	
	public static void main(String[] args) {
			
		Thread t = Thread.currentThread();
		System.out.println("Before Name Change : "+t);
		t.setName("MyThread");
		System.out.println("After Name Change : "+t);
		System.out.println("Before Priority Change : "+t);
		t.setPriority(5);
		System.out.println("After Priority Change : "+t);
		
		for(int i=1;i<=5;i++)
		{
			System.out.println(t+ " : "+i);
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}

}











