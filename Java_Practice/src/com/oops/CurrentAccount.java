package com.oops;

public class CurrentAccount extends DefaultAccount{
	
	double rateOfInterest;
	
	public CurrentAccount()
	{
		rateOfInterest=5;
	}
	public double rateOfInterest()
	{
		System.out.println("I am in Current Account");
		return rateOfInterest;
	}


}
