package com.inheritance;

/*A bank has a principal amount and a rate of interest which is 2%. 
A savings account has a rate of interest 3% while a current account has 5%.
Write a method that displays the rate of interest based on whether the 
account is default/ savings/ current.*/


public class BankAccount {
	
	double amount;
	int interest;
	
	public BankAccount()
	{	
		this.amount=0;
		this.interest=0;
		
	}
	public BankAccount(double amount, int interest)
	{	
		this.amount=amount;
		this.interest=interest;
	}
	
	@Override
	public String toString() {
		return "BankAccount [amount=" + amount + ", interest=" + interest + "%]";
	}
	public static void main(String[] args) 
	{
		BankAccount obj= new BankAccount(20000,2);
		System.out.println(obj);

	}

}
