package com.test2;

public class HourBased extends Teacher{
	
	int rate;
	int hrs;
	int salary;
	public HourBased()
	{
		
	}
	public HourBased(int id, long mob,int rate, int hrs, int salary)
	{
		super(id,mob);
		this.hrs=hrs;
		this.rate=rate;
		this.salary=salary;
	}
	
	@Override
	public void salary()
	{
		salary=salary+(rate*hrs);
		
	}
	@Override
	public String toString() {
		return super.toString()+"\nSalary = "+salary;
	}
	
	public static void main(String[] args) {
		
		HourBased obj = new HourBased(101,1202321301,50,10,35000);
		obj.salary();
		System.out.println(obj);
		
	}
	
}
