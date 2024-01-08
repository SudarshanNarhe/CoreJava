package com.containment;

//dept has (dept_id, dept_name)

public class Dept {

	private String dept_id;
	private String dept_name;
	
	public Dept ()
	{
		
	}
	public Dept(String id,String name)
	{
		this.dept_id=id;
		this.dept_name=name;
	}
	public void setID(String id)
	{
		this.dept_id=id;
	}
	public String getID()
	{
		return dept_id;
	}
	public void setName(String name)
	{
		this.dept_name=name;
	}
	public String getName()
	{
		return dept_name;
	}
	public String toString()
	{
		return "Department Name : "+dept_name+"\nDepartment Id : "+dept_id;
	}
	
	public static void main(String[] args) {
		
		Dept obj= new Dept("TQ 123","Think Quotient");
		System.out.println(obj);

	}

}
