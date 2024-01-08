package com.array;

import java.util.Scanner;

/*WAP to print the employees from Employee[] array who has same salary 
(Create Employee class which has 3 attributes id, name, salary and add employee objects to your array)
//Accept id from user and show all emp who get same sal has given id*/


public class Employee {

	private int id;
	private String name;
	private double salary;
	
	public Employee()
	{
		
	}
	public Employee(int id, String name , double salary)
	{
		this.id =id;
		this.name=name;
		this.salary=salary;
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
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	public double getSalary()
	{
		return salary;
	}
	public String toString ()
	{
		return "Employee Id : "+id+"\nEmployee name : "+name+"\nEmployee Salary : "+salary;
	}
	
	
	
	public static void main(String[] args) {
		
		Employee obj[]=new Employee[5];
		obj[0]= new Employee(12,"Sudarshan",35000);
		obj[1]=new Employee(10,"Nitin",34000);
		obj[2]=new Employee(8,"Pavan",34000);
		obj[3]=new Employee(7,"Rahul",40000);
		obj[4]=new Employee(18,"Rakesh",35000);
		
		Employee obj1=new Employee();
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter ID : ");
		int id1=sc.nextInt();
		
		for(int i=0;i<obj.length;i++)
		{
			if(id1==obj[i].getID())
			{
				obj1=obj[i];
				break;
			}
		}
			
			if(obj1.salary!=0)
			{
				
				for (int i=0;i<obj.length;i++)
				{
					if(obj[i].salary==obj1.salary)
					{
						System.out.println(obj[i]);
					}
				}
			}
			else 
			{
				System.out.println("Employee doesn't exist for these ID : "+id1);
			}
			
				
			
		

	sc.close();	

		
	}
	
}

