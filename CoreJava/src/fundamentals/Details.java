package fundamentals;

import java.util.Scanner;

public class Details {
		
	String name;
	
	void naamchaie()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Aapka naam batao");
		name = sc.next();
	}
	
	void naamdikhaie()
	{
		System.out.println("Aapka Naame hai "+name);
	}
	
	public static void main(String[] args) {
		Details d = new Details();
		d.naamchaie();
		d.naamdikhaie();
		
	}

}
