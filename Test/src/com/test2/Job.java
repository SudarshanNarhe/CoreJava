package com.test2;

public class Job {
	
	int id;
	String role;
	double salary;
	
	Job()
	{
		
	}
	public Job(int id, String role, double salary)
	{
		this.id=id;
		this.role=role;
		this.salary=salary;
	}
	public String toString ()
	{
		return "Job Id :"+id+"\nRole : "+role+"\nSalary : "+salary;
	}
}
