package com.finalDemo;

 public class Employee {

	final private int eid;
	private String name;
	private double salary;
	private MyDate d;
	
	public Employee()
	{
		eid=15;
		System.out.println("I am in Default const...");
	}
	public Employee(int id, String name, double sal, MyDate d)
	{
		this.eid=id;
		this.name=name;
		this.salary=sal;
		this.d=d;
	}
//	public void setID(int id)
//	{
//		this.eid=id;
//	}
//	public int getID()
//	{
//		return eid;
//	}
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
	final public double getSalary()
	{
		return salary;
	}
	
	public String toString()
	{
		return "Employee Id : "+eid+"\nEmployee name : "+name+"\nEmployee salary : "+salary+"\n"+"Date of joining "+d;
	}
	

	public static void main(String[] args) {
		
		Employee obj=new Employee(12,"Sudarshan",35000,new MyDate(12,5,2023));
		System.out.println(obj);
		
	}

}
