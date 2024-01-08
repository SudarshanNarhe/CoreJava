package com.array;

/*Create class Dept(did, dname), class MyDate(day, month, year)
Class Employee(emp_id, emp_name, salary, date(object), dept(object)). 
Create array of Employee and display the array elements.*/

public class EmployeeDepartment {

	private String emp_id;
	private String name;
	private double salary;
	private DepartmentDate date;
	private Department dept;
	
	public EmployeeDepartment()
	{
		
	}
	public EmployeeDepartment(String id, String name, double salary, DepartmentDate date, Department dept)
	{
		this.emp_id=id;
		this.name=name;
		this.salary=salary;
		this.date=date;
		this.dept=dept;
		
	}
	public void setID(String id)
	{
		this.emp_id=id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	public void setDate (DepartmentDate date)
	{
		this.date=date;
	}
	public void setDepartment(Department dept)
	{
		this.dept=dept;
	}
	public String getID()
	{
		return emp_id;
	}
	public String getName()
	{
		return name;
	}
	public double getSalary()
	{
		return salary;
	}
	public DepartmentDate getDate()
	{
		return date;
	}
	public Department getDepartment()
	{
		return dept;
	}
	public String toString()
	{
		return  dept+"\nEmployee id : "+emp_id+"\nEmployee name : "+name+"\nDate of Joining : "+date+"\nSalary : "+salary+"\n";
	}
	
	public static void main(String[] args) {
		
		
		DepartmentDate date=new DepartmentDate(26,9,2023);
		Department dept1=new Department(8,"Developers");
		EmployeeDepartment obj[]= new EmployeeDepartment[5];
		obj[0]=new EmployeeDepartment("J3","Sudarshan",25000,date,new Department(3,"Java_Developers"));
		obj[1]=new EmployeeDepartment("SQL5","Suraj",35000,date,new Department(5,"SQL"));
		obj[2]=new EmployeeDepartment("J4","Ishwar",15000,new DepartmentDate(12,5,2023),new Department(4,"Java_Developers"));
		obj[3]=new EmployeeDepartment("D23","Maturi",20000,date,dept1);
		obj[4]=new EmployeeDepartment("D12","Adarsh",30000,date,dept1);

		
		for(int i=0;i<obj.length;i++)
		{
			for(int j=0;j<obj.length;j++)
			{
				if(obj[i].dept.ComapareDepartment(obj[j].dept)&& i!=j)
				{
					System.out.println(obj[i]); 
					break;
				}
			}
		}
		
	}

}
