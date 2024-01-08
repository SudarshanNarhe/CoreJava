package com.methods;

public class InterestRate {

	private int acno, t, principal;
	private double  si;
	private String name;
	
	
	public  InterestRate(int ac, int t1, int p, String nam)
	{
		acno=ac;
		t=t1;
		principal=p;
		name=nam;
	}
	public static float interestrate;
	static
	{
		interestrate=5;
	}
	public void interest(float rate)
	{
		interestrate=rate;
	}
	public double calculateinterest()
	{
		si=t*principal*interestrate/100;
		return si;
	}
	
	
	public void display()
	{
		System.out.println("Name of the Account holder : "+name);
		System.out.println("Account number : "+acno);
		System.out.println("Balance : "+principal);
		System.out.println("The Interest you will get : "+si);
		System.out.println("Time in yrs = "+t);
		System.out.println("Si = "+si);
		System.out.println("Rate = "+interestrate);
	}
	 
	
	public static void main(String[] args) {
		
		InterestRate obj= new InterestRate(7658,3,12500,"Sudarshan");
		obj.interest(5);
		obj.calculateinterest();
		obj.display();



	}

}
