package com.collections;

import java.util.HashSet;
import java.util.Iterator;

/*
 * HashSet : it internally implements the Set interface and extends the abstract class Set.
 * 
 * 			- it internally uses HashFunction Table.
 * 			- it does not maintain the Insertion Order , because the Hash Function will 
 * 			  decide ,which element to store at which position.
 * 			- No Duplicate Values are allowed.
 * 			- it stores Multiple values of Multiple types. 
 */


public class HashSetDemo {
	
	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		hs.add(15);
		hs.add("Tops");
		hs.add('t');
		hs.add(15.15f);
		hs.add(true);
		hs.add(15);
		hs.add(null);
		
		System.out.println(hs);
		
		Iterator itr = hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());			
		}
		
		
		
		
	}

}
