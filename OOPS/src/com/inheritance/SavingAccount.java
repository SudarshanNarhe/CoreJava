package com.inheritance;

public class SavingAccount extends BankAccount{
	
	public SavingAccount() 
	{
		
	}
	
	public SavingAccount(double amount, int interest)
	{
		super(amount,interest);
		

	}
	
	@Override
	public String toString() {
		return "SavingAccount "+super.toString();
	}
	public static void main(String[] args)
	{
		SavingAccount obj= new SavingAccount(230000,3);
		System.out.println(obj);

	}

}
