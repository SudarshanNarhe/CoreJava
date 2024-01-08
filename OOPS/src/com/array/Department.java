package com.array;

/*Create class Dept(did, dname), class MyDate(day, month, year)
Class Employee(emp_id, emp_name, salary, date(object), dept(object)). 
Create array of Employee and display the array elements.
Same as above but print Employees whose dept_name is same.
*/


public class Department {

	private int id;
	private String depname;
	
	public Department()
	{
		
	}
	public Department(int id, String name)
	{
		this.id=id;
		this.depname=name;
	}
	public void setID(int id)
	{
		this.id=id;
	}
	public void setName(String name)
	{
		this.depname=name;
	}
	public int getID()
	{
		return id;
	}
	public String getName()
	{
		return depname;
	}
	public boolean ComapareDepartment(Department obj)
	{
		if(this.depname==obj.depname)
		{
			return true;
		}
		else 
			return false;
	}
	public String toString()
	{
		return "Department Id : "+id+"\nDeparment name : "+depname;
	}
	
	public static void main(String[] args) {
		
		Department obj=new Department(23,"Java_Department");
		System.out.println(obj);

	}

}
