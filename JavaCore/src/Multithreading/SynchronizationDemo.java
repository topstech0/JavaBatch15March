package Multithreading;

/*
 * Synchronization : To avoid the Thread interference, we make use of Thread Synchronization.
 * 
 * 					: to use synchronization, we make use of synchronized keyword.
 * 					: it will hold the next Thread, until the current Thread is not executed.
 * 					
 *  * 
 * 
 */


class Caller
{
	public void call(String msg)
	{
		System.out.print("["+msg);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("]");
	}
}

class Callback implements Runnable
{

	Thread t;
	String tname;
	Caller c;	
	
	public Callback(String tname, Caller c) {		
		
		this.tname = tname;
		this.c = c;
		t = new Thread(this);
		t.start();		
	}

	public void run() {
		
		synchronized (c) {
			c.call(tname);
		}
			
		
		
	}
	
}


public class SynchronizationDemo {
	
	public static void main(String[] args) {
		
		Caller c = new Caller();
		Callback c1 = new Callback("Hello", c);
		Callback c2 = new Callback("Synchronized", c);
		Callback c3 = new Callback("Demo",c);
	}

}
