package keywords;

/*
 * this :  it is a keyword which refers to the current class members.
 * 
 */

public class ThisKeywordDemo {

	String name;
	int age;
	double sal;
	
	
	public ThisKeywordDemo(String name,int age,double sal) {
	
		this.name = name;
		this.age = age;
		this.sal = sal;
	}
	
	
	

	void show()
	{
		System.out.println("Name : "+this.name+"\nAge : "+this.age+"\nSalary : "+this.sal);
	}
	
	
	
	public static void main(String[] args) {
		
		ThisKeywordDemo obj = new ThisKeywordDemo("chirag",23,100000.0);
		obj.show();
	}

}
