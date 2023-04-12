package com.filehandling;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * Serialization : To write the current status of an object into the file
 * 				   is called Serialization.
 * 
 * 
 *  - Whenever you want to write the object into the file, it is compulsory
 *    to implements the Serializable interface of that particular class.
 * 
 *  - Serializeable : It is an interface, which does not contain any methods or fields
 *  				: It is also called as Marker interface.
 *  
 *   -> So Why we need to implement the Serializable interface ?
 *   
 *    -  Classes that do not implement this interface will not have any of their 
 *       state serialized or deserialized.
 *       
 *    note: it means that you cannot write the object of the class into the file.
 *   
 *   
 *   Deserialization : To read the current status of an object from the file
 * 					is called Deserialization.
 *  ----------------------------------------------------------------------------------------
 *  Feature of Serialization :
 *  
 *  - it is unreadble file.
 *  - it provides you the Security.
 * 
 * -----------------------------------------------------------------------------------------
 * 
 * toString() Method
 * 
 * -> it is a method which belongs to the String Class.
 * -> to convert data into String we can make use of toString() Method.
 * -> it does not get called manually.
 * 
 * Imp note :
 * 
 * -> it gets called automatically, when you print the object of the particular class.
 * 
 * 
 * 
 */


class Employee implements Serializable{
	
	int eno;
	String ename;
	double esal;
	
	public Employee(int eno, String ename, double esal) {		
		this.eno = eno;
		this.ename = ename;
		this.esal = esal;
	}
	
	
	public String toString()
	{
		return "Employee Number :"+this.eno+"\nName : "+this.ename+"\nSalary : "+this.esal;
	}
	
}




public class SerializationDemo {
	
	public static void main(String[] args) throws Exception {
	
		Employee e = new Employee(101,"Ritul",80000);
		FileOutputStream fos = new FileOutputStream("ser.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(e);
		oos.flush();
		oos.close();
		System.out.println("Object Written Successful.");
		
		FileInputStream fis = new FileInputStream("ser.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee e1 = (Employee)ois.readObject();
		System.out.println(e1);
		ois.close();	
	}

}
