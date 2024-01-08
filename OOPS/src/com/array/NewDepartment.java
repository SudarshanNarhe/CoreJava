package com.array;

/*Employee class is as follows .
Employee {
int empno ;
String name ;
Department dept ;}
Where dept is object of department class. Department class
as deptId and deptname.      
Write a program to create array of 3 employees. Each
employee will have different department. */

public class NewDepartment {

	private int depid;
	private String deptname;
	
	public NewDepartment()
	{
		
	}
	public NewDepartment(int depid, String deptname)
	{
		this.depid=depid;
		this.deptname=deptname;
	}
	public String toString()
	{
		return "Department ID : "+depid+"\nDepartment Name : "+deptname;
	}
	
	public static void main(String[] args) {
		
		

	}

}
