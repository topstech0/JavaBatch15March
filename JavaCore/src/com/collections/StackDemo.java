package com.collections;

import java.util.Stack;

/*
 * Stack : it follows LIFO (Last in First Out) order.
 * 			
 * 			e.g Plates arrangement.
 * 		 
 * 
 * 
 * 
 */

public class StackDemo {

	public static void main(String[] args) {
		
		Stack st = new Stack();
		st.push(10);
		st.push(10.11f);
		st.push("tops");
		st.push('t');
		st.push(10);
		st.push(true);
		st.push(null);
		System.out.println(st);
		
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		
	}
}
