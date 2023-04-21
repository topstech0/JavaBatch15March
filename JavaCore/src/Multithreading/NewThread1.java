package Multithreading;

public class NewThread1 extends Thread {
	
	public NewThread1() {
		super("Child Thread");
		start();
	}
	
	
	public void run()
	{
		for(int i =1;i<=5;i++)
		{
			System.out.println(this+":"+i);						
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println("Child Thread Exiting.");
	}
	
	
	public static void main(String[] args) {
		new NewThread1();
	}

}
