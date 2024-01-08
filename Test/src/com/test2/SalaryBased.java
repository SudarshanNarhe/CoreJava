package com.test2;

public class SalaryBased extends Teacher{
	
	int salary;
	
	public SalaryBased()
	{
		
	}
	public SalaryBased(int id, long mob,int salary)
	{
		super(id,mob);
		this.salary=salary;
	}
	@Override
	public void salary() {
		
	}
	
	@Override
	public String toString() {
		return super.toString()+"\nBased Salary : "+ salary;
	}
	public static void main(String[] args) {
		
		SalaryBased obj= new SalaryBased(101,12012012,35000);
		System.out.println(obj);
		obj.salary();
		

	}
	

}
