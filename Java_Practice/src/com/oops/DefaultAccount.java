package com.oops;

// Use of instanceof

public class DefaultAccount {
	
	double rateOfInterest;
	
	public DefaultAccount() 
	{
		rateOfInterest=2;
	}
	
	public double rateOfInterest()
	{
		System.out.println("Inside Default Account method");
		return rateOfInterest;
	}
	
}
