package com.inheritance;

public class CurrentAccount extends BankAccount{

	public CurrentAccount() {
		
	}
	public CurrentAccount(double amount, int interest) 
	{
		super(amount,interest);
		
	}
	 
	@Override
	public String toString() {
		return "CurrentAccount "+super.toString();
	}
	public static void main(String[] args) {
		
		BankAccount bk= new BankAccount(25000,2);
		SavingAccount sk= new SavingAccount(35000,3);
		CurrentAccount kk= new CurrentAccount(45000,5);
		System.out.println(bk);
		System.out.println(sk);
		System.out.println(kk);
		
		
	}

}
