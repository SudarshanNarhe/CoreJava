package com.inheritance;

public class WageSalary extends Employee
{
	private double hr;
	private double rate;
	
	public WageSalary()
	{
		this.hr=0;
		this.rate=0;
	}
	public WageSalary(int id, String name, double salary, MyDate d,double hr,double rate)
	{
		super(id,name,salary,d);
		this.hr=hr;
		this.rate=rate;	
	}
	@Override
	public String toString()
	{
		return super.toString()+"\nHours : "+hr+"\nRate : "+rate;
	}
	public double calSalary()
	{
		double sal=super.calSalary()+hr*rate;
		super.setSalary(sal);;
		return sal;
	}
	
	public static void main(String[] args) {
		
		WageSalary ws=new WageSalary(101,"Sudarshan",35000,new MyDate(23,9,2023),10,50);
		ws.calSalary();
		System.out.println(ws);

	}

}
