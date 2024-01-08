package com.exception;

public class InsufficientBalanceExceptions extends Exception{
	
	double balance;
	
	public InsufficientBalanceExceptions() {
		
	}
	public InsufficientBalanceExceptions(double bal) {
		balance=bal;
	}
	@Override
	public String toString() {
		
		return balance+" is not Sufficient Balance ";
	}
	

}
