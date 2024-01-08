package com.array;

/*Create class Dept(did, dname), class MyDate(day, month, year)
Class Employee(emp_id, emp_name, salary, date(object), dept(object)). 
Create array of Employee and display the array elements.
Same as above but print Employees whose dept_name is same.
*/

public class DepartmentDate {

	private int dd;
	private int mm;
	private int yy;
	
	public DepartmentDate()
	{
		
	}
	public DepartmentDate(int dd,int mm,int yy)
	{
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}
	public void Setdd(int dd)
	{
		this.dd=dd;
	}
	public int getdd()
	{
		return dd;
	}
	public void setmm(int mm)
	{
		this.mm=mm;
	}
	public int getmm()
	{
		return mm;
	}
	public void setyy(int yy)
	{
		this.yy=yy;
	}
	public int getyy()
	{
		return yy;
	}
	
	public String toString()
	{
		return dd+"/"+mm+"/"+yy;
	}
	public static void main(String[] args) {
		
		DepartmentDate obj=new DepartmentDate(26,3,2023);
		System.out.println(obj);
		
	}

}
