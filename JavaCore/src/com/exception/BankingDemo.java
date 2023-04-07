package com.exception;
/*
 * 
 * Custom Exception :
 * 
 * - it is a User Defined Exception, where we create our own Exception Class.   * 
 * - To create our Exception class, we need to extends the Exception class.
 * 
 */

import java.util.Scanner;

class insufficientFunds extends Exception
{
	double amount;

	public insufficientFunds(double amount) {		
		this.amount = amount;
	}
	
	public double getAmount()
	{
		return this.amount;
	}	
}

class checkingAccount
{
	long accno;
	double balance=0;
	
	public checkingAccount(long accno) {		
		this.accno = accno;
		System.out.println("\nYour Account No : "+this.accno);
	}
		
	public void deposit(double amount)
	{
		this.balance = this.balance + amount;
	}
	
	public void checkBalance()
	{
		System.out.println("Your Account Balance : Rs."+this.balance);
	}
	
	public void withdraw(double amount) throws insufficientFunds
	{
		if(amount<=this.balance)
		{
			this.balance = this.balance - amount;
		}
		else
		{
			double needs = amount - this.balance;
			throw new insufficientFunds(needs);
		}
	}
	
	
	
}



public class BankingDemo {
	
	public static void main(String[] args) {
		
		checkingAccount c1 = new checkingAccount(336546978799l);
		c1.checkBalance();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n\nEnter the Amount to Deposit.");
		double amt = sc.nextDouble();
		c1.deposit(amt);
		c1.checkBalance();
		
		try {
			System.out.println("\n\nEnter the Amount for Withdrawal.");
			amt = sc.nextDouble();
			c1.withdraw(amt);
			System.out.println("\nSuccessful Withdrawal");
					
		} catch (insufficientFunds e) {
			// TODO Auto-generated catch block
			System.out.println("Sorry you need Rs."+e.getAmount()+" more for Withdrwal.");
		}
		
		c1.checkBalance();
		System.out.println("\n\n******Thank You*******");
	}

}
