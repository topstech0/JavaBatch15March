package fundamentals;

import java.util.Scanner;

/*
 * Array : It is a name at memory which stores multiple values of sametype.
 * 
 * 			- Indexing starts with 0.
 * 
 */

public class ArrayDemo {
	
	public static void main(String[] args) {
		
		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0;i<a.length;i++)
		{
			System.out.print("Enter Element ["+(i+1)+"] :");
			a[i] = sc.nextInt(); 
		}
		
		System.out.println("\n\nOriginal Array Elements are : ");
		for(int i = 0;i<a.length;i++)
		{
			System.out.println("Element ["+(i+1)+"] :"+a[i]);			
		}
		
		for(int i =0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}
		
		System.out.println("\n\n Array Elements in Ascending Order are : ");
		for(int i = 0;i<a.length;i++)
		{
			System.out.println("Element ["+(i+1)+"] :"+a[i]);			
		}
		
	}

}
