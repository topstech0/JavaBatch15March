package com.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
 * HashMap : it internally implements Map interface, and extends abstract class Map
 * 		
 * 			- HashMap works with Key and Value Pair
 * 			- Every Key will be unique.
 * 			- No Duplicate Keys are allowed.
 * 
 * 
 */


public class HashMapDemo {
	
	public static void main(String[] args) {
		
		HashMap hm = new HashMap();
		hm.put(1, "Ramesh");
		hm.put(2, "Suresh");
		hm.put(3, "Mangesh");
		hm.put(4, "Rajesh");
		hm.put(5, "Haresh");
		hm.put(6, "Lokesh");
		hm.put(4, "Suyesh");
		
		for(int i=2;i<=5;i++)
		{
		System.out.println(hm.get(i));
			
		}
		/*
		System.out.println(hm);
		System.out.println(hm.get(5));
		hm.remove(4);
		System.out.println(hm);
		
		Set set = hm.entrySet();
		
		Iterator itr = set.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		*/
		
	}

}







