package com.methods;

public class EmployeeId {
	
	 static int  count=1;
	private int id=count;
	private String name;
	private String mail;
	private double sal;
	private static String companyname="Java_Company pvt.Ltd ";
	
	EmployeeId()
	{
		this.id=count++;
	}
	
	public void setData(double sal, String nam, String mail)
	{
		
		this.sal=sal;
		this.mail=mail;
		name=nam;
	}
	
	public void display()
	{
		System.out.println(companyname);
		System.out.println("Name of Employee : "+name);
		System.out.println("Employee id : "+id);
		System.out.println("Mail : "+mail);
		System.out.println("Salary : "+sal);
	}

	public static void main(String[] args) {
		
		EmployeeId obj=new EmployeeId();
		EmployeeId bjp=new EmployeeId();
		EmployeeId abc=new EmployeeId();
		obj.setData(25000, "Sudarshan", "narhe@123");
		obj.display();
		bjp.setData(35000, "nitin", "nitin@746");
		bjp.display();
		abc.setData(45000, "Maruti","maruti@453");
		abc.display();

	}

}
