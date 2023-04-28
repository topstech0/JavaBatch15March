package com.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;


/*
 * Like in Generic, we have a predefined Entity Class, unlike from this 
 * we can also create a User Defined Generic Class.
 * 
 * to use Generic Class, we will use the Comparator interface
 * 
 * 
 */


class Employee{
	
	int eid;
	String ename;
	double salary;
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
		
}




public class ComparatorDemo implements Comparator<Employee> {
	
	
	public int compare(Employee e1, Employee e2) {
		
		int value=0;
		
		if(e1.getSalary()>e2.getSalary())
		{
			value = 1;
		}
		else if(e1.getSalary()<e2.getSalary())
		{
			value=-1;
		}
		else {
			value = 0;
		}
			
		return value;
	}
	
	public static void main(String[] args) {
		
		ArrayList<Employee> list  = new ArrayList<Employee>();
		
		Employee e1 = new Employee();
		e1.setEid(101);
		e1.setEname("Chirag");
		e1.setSalary(35000);
		
		Employee e2 = new Employee();
		e2.setEid(102);
		e2.setEname("Parth");
		e2.setSalary(40000);
		
		Employee e3 = new Employee();
		e3.setEid(103);
		e3.setEname("Pramod");
		e3.setSalary(25000);
		
		Employee e4 = new Employee();
		e4.setEid(104);
		e4.setEname("Jay");
		e4.setSalary(21000);
		
		Employee e5 = new Employee();
		e5.setEid(105);
		e5.setEname("Virat");
		e5.setSalary(48000);
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		
		//System.out.println(list);
		
		
		Collections.sort(list, new ComparatorDemo());
		
		//System.out.println(list);
		
		for(Employee e : list)
		{
			System.out.println("Eid : "+e.getEid()+"\nEname : "+e.getEname()+"\nSalary : "+e.getSalary());
		}
		
	}

	

}











