package com.exception;

public class Account {

	String name;
	int acNo;
	double balance;
	
	public Account() {
		
	}
	public Account(int ac, String name,double bal) {
		this.acNo=ac;
		this.name=name;
		this.balance=bal;
	}
	public void debit(double amt) throws InsufficientBalanceExceptions {
		
		if(balance<amt) {
			throw new InsufficientBalanceExceptions(balance);
		}
		else {
			balance=balance-amt;
			System.out.println("The remaining balance is : "+balance);
		}
	}
	public void credit(double amt) {
		balance+=amt;
		System.out.println("After Credit Balance is : "+balance);
	}
	public String toString() {
		
		return "Account Holder Name : "+name+"\nAccount Number : "+acNo+"\nBalance : "+balance;
	}
	public static void main(String[] args) {
		
		Account obj= new Account(1234,"Sudarshan",40000);
		System.out.println(obj);
		obj.credit(15000);
		try {
			obj.debit(30000);
		} catch (InsufficientBalanceExceptions e) {
			
			System.out.println(e);
		}
		
		
	}

}
