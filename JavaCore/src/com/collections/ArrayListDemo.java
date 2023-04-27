package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/*
 * Collections : it is a group of data.
 * 
 * 				- One Object can contain more than one Object.
 * 
 * - In c/c++ we have Structure, where it stores multiple elements of multiple types.
 * - In Java we have Collections.
 * 
 *  
 * ArrayList : 
 * 
 * 	- ArrayList is a class, which internally implements the List interface. 
 * 
 *  - it is similar like an Array, because the index starts from 0.
 *  - Like Array , it stores the multiple values but of same type.
 *  - But ArrayList stores the multiple values of Multiple types.
 *  
 *  - it stores the data in Sequential Manner.
 *  - Duplicate values are allowed.
 *  - ArrayList is Dynamic, whereas Array is Static.
 * 
 * Iterator :
 * 
 * - Iterator is an interface, which is used to iterate each element at a time.
 * - it follows Top-Bottom Approach.
 * 
 * ListIterator :
 * 
 * - it is an inteface , which is used to iterate each elements, but here it 
 *   follows Top-Bottom and Bottom-Top Approach.
 * 
 */



public class ArrayListDemo {
	public static void main(String[] args) {		
		
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(10.10f);
		al.add("Tops");
		al.add(true);
		al.add('t');
		al.add(10);

;
		System.out.println(al);
		
		System.out.println(al.indexOf(10.10f));
		System.out.println(al.isEmpty());
		System.out.println(al.remove(5));
		System.out.println(al);
		al.set(5, 10.10f);
		System.out.println(al);
		al.add(3, "Parth");
		System.out.println(al);
		System.out.println(al.lastIndexOf("Parth"));
		System.out.println(al.size());
		System.out.println(al);
		
		System.out.println("\n\nIterating through Iterator");
		Iterator itr = al.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("\n\nIterating through List Iterator -Top to Bottom");
		ListIterator litr = al.listIterator();
		
		while(litr.hasNext())
		{
			System.out.println(litr.next()+"tops");
		}
		
		System.out.println("\n\nIterating through List Iterator -Bottom to Top");
		
		while(litr.hasPrevious())
		{
			System.out.println(litr.previous());
		}
		
	}

}











