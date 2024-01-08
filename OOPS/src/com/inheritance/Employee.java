package com.inheritance;

public class Employee {

	private int eid;
	private String name;
	private double salary;
	private MyDate d;
	
	public Employee()
	{
		
		this.eid=0;
		this.name=" ";
		this.salary=0;
		this.d=new MyDate();	
	}
	public Employee(int id, String name, double salary, MyDate d)
	{
		this.eid=id;
		this.name=name;
		this.salary=salary;
		this.d=d;	
	}
	public void setID(int id)
	{
		this.eid=id;
	}
	public int getID()
	{
		return eid;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	public double getSalary()
	{
		return salary;
	}
	
	public String toString()
	{
		return "Employee Id : "+eid+"\nEmployee name : "+name+"\nEmployee salary : "+salary+"\n"+"Date of joining "+d;
	}
	public double calSalary()
	{
		return salary;
	}
	
}
