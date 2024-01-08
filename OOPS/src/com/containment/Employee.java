package com.containment;

/*Create Employee class which has attributes (id, name, salary, dept,
mydate). Where dept and mydate is class, dept has (dept_id, dept_name)
And mydate has (day, month, year).
Display Employee information.*/


public class Employee {

	private int id;
	private String name;
	private double salary;
	private Dept dep;
	private MyDate date;
	
	public Employee()
	{
		
	}
	public Employee(int id, String name,double salary, Dept dep, MyDate date)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.dep=dep;
		this.date=date;
	}
	public void setID(int id)
	{
		this.id=id;
	}
	public int getID()
	{
		return id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setSalary(double sal)
	{
		this.salary=sal;
	}
	public double getSalary()
	{
		return salary;
	}
	public void setDepartment(Dept dep)
	{
		this.dep=dep;
	}
	public Dept getDepartment()
	{
		return dep;
	}
	public void setMyDate(MyDate date)
	{
		this.date=date;
	}
	public MyDate getMyDate()
	{
		return date;
	}
	public String toString()
	{
		return "Employee ID : "+id+"\nEmployement name : "+name+"\nSalary : "+salary+"\nDepartment : "+dep+"\nDate of Joining : "+date;
	}
	
	public static void main(String[] args) {
		
		MyDate dd= new MyDate(23,9,2023);
		Dept dep=new Dept("TQ123","Think Quotient");
		Employee obj= new Employee(263,"Sudarshan",35000,dep,dd);
		System.out.println(obj);

	}

}
