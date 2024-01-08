package com.demo;

public class Account2 {
	
	private long balance=5000;
	
	public long getBalance() {
		return balance;
	}
	
	public void withDraw(int amount) {
		if(balance>amount) {
			balance=balance-amount;
			System.out.println("The Amount is withdrawn by "+Thread.currentThread().getName());
		}
		else
			System.out.println(Thread.currentThread().getName()+" : Insufficient Balance");
	}
	public void deposit(int amount) {
		balance=balance+amount;
		System.out.println("The Amount deposited by : "+Thread.currentThread().getName()+"\nTotal Balance : "+balance);
	}
}
