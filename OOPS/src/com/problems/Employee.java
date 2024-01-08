package com.problems;

import java.util.Scanner;

public class Employee {

	long id,sal,pf,hra,da;
	String name, mail;
	public void setData(long iid, long sal1, String nam, String mail1)
	{
		id=iid;
		name=nam;
		mail=mail1;
		sal=sal1;
	}
	public void display()
	{
		System.out.println("Your basic salary is : "+sal);	
	}
	public void calPF(long pf)
	{
		pf=(sal*10)/100;
		System.out.println("PF : "+pf);
	}
	public void calHRA(long hra)
	{
		hra=(sal*15)/100;
		System.out.println("HRA : "+hra);
	}
	public void calDA(long da)
	{
		da=(sal*18)/100;
		System.out.println("DA : "+da);
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name : ");
		String name=sc.next();
		System.out.println("Enter your Emlpoyment Id : ");
		long id=sc.nextLong();
		System.out.println("Enter your email id : ");
		String mail=sc.next();
		System.out.println("Enter your basic salary : ");
		long sal=sc.nextLong();
		
		Employee obj=new Employee();
		obj.setData(id, sal, name, mail);
		obj.display();
		obj.calPF(sal);
		obj.calHRA(sal);
		obj.calDA(sal);
		
		
sc.close();
	}

}
