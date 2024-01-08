package com.methods;

public class CompareSalary {

	private double salary; 
	private int employeeid;
	private String name; 
	private String mail;
	
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	public double getSalary()
	{
		return salary;
	}
	public void setEmployeeid(int id)
	{
		employeeid =id;
	}
	public double getEmployeeid()
	{
		return employeeid;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String Name()
	{
		return name;
	}
	public void setMail(String mail)
	{
		this.mail=mail;
	}
	public String mail()
	{
		return mail;
	}
	
	public void setData(double sal, int id, String name, String mail)
	{
		salary=sal;
		employeeid=id;
		this.name=name;
		this.mail=mail;
	}
	public void display()
	{
		System.out.println("Name : "+name);
		System.out.println("Employement id : "+employeeid);
		System.out.println("Mail : "+mail);
		System.out.println("Basic Salary : "+salary);
	}
	public void compare(CompareSalary ob)
	{	
		System.out.println(this.salary);
		System.out.println(ob.salary);
		if(this.salary>ob.salary)
		{
			System.out.println(this.name+" has a highest salary.");
		}
		else 
			System.out.println(ob.name+" has a highest salary.");
	}
	
	public static void main(String[] args) {
			
		CompareSalary obj=new CompareSalary();
		obj.setData(35000, 125, "Sudarshan", "narhe@123");
		obj.display();
		
		CompareSalary obj1=new CompareSalary();
		obj1.setData(25000, 231, "Ketan", "ketan@132");
		
		obj1.display();
		
		obj.compare(obj1);
		
		
		
		
	}

}
