package com.methods;

public class Employee {
	
	
	private int id;
	private String name;
	private String mail;
	private double sal;
	private static String companyname="Java_Company pvt.Ltd ";
	
	public void setData(int id,double sal, String nam, String mail)
	{
		this.id=id;
		this.sal=sal;
		this.mail=mail;
		this.name=nam;
	}
	
	public static void setCompanyName(String nam)
	{
		companyname=nam;
		
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
		
		Employee obj=new Employee();
		obj.setData(123, 35000, "Sudarshan", "narhe@1232");
		obj.display();
		Employee bjp=new Employee();
		bjp.setData(345, 45000, "Nitin", "nitin@789");
		Employee.setCompanyName("Developers");
		bjp.display();
		
		
	}

}
