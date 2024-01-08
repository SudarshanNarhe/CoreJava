package com.demo;

public class WithOutSync implements Runnable {

	private Account a1;
	private Thread t1,t2;
	
	public WithOutSync() {
		a1=new Account();
		t1=new Thread (this,"Person 1");
		t2=new Thread (this,"Person 2");
		t1.start();
		t2.start();
	}
	
	public void doTransaction() {
		
		System.out.println(Thread.currentThread().getName()+" is checking the balance = "+a1.getBalance());
		
		a1.withdraw(4500);
	}
	@Override
	public void run() {
		
		doTransaction();
		
	}
	
	public static void main(String[] args) {
		
		WithOutSync wo = new WithOutSync();
		
	}
	
}
