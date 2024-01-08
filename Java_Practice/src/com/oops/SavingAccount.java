package com.oops;

public class SavingAccount extends DefaultAccount {

	double rateOfInterest;
	
	public SavingAccount() {
		rateOfInterest=3;
	}
	public double rateOfInterest()
	{
		System.out.println("I am in Saving Account");
		return rateOfInterest;
	}
}
