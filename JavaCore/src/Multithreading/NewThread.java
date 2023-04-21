package Multithreading;

/*
 * To use the Thread , Java has provided the two possible ways
 * 
 * 1) To implement the Runnable interface.
 * 
 *  	- By default in Runnable interface, there is a run method declared.
 * 
 * 2) To extend the Thread Class.
 * 
 * 
 * 
 */


public class NewThread implements Runnable {

	Thread t;
	String tname;
	
	public NewThread(String tname) {
		
		this.tname = tname;
		t = new Thread(this,tname);
		t.start();
	}

	public void run() {
		
		for(int i=1;i<=5;i++)
		{
			System.out.println(t + " : "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Child Thread Exiting");
	}
	
	public static void main(String[] args) {		
		new NewThread("One");
		new NewThread("Two");
		new NewThread("Three");
	}



}
