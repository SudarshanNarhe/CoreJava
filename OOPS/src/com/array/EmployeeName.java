package com.array;

/*Write a Java program to create array of Employee objects.
Employee class has empNo , name. Array size should be 5.Make use of for loop.*/


public class EmployeeName {

	private int empNo;
	private String name;
	
	public EmployeeName()
	{
		
	}
	public EmployeeName(int empNo, String name)
	{
		this.empNo=empNo;
		this.name=name;
	}
	
	public static void main(String[] args) {
		
		EmployeeName emp[]=new EmployeeName[5];
		emp[0]= new EmployeeName(10,"Sudarshan");
		emp[1]= new EmployeeName(11,"Pavan");
		emp[2]= new EmployeeName(12,"Rakesh");
		emp[3]= new EmployeeName(13,"Rahul");
		emp[4]= new EmployeeName(14,"Rohan");
		
		for(int i=0;i<emp.length;i++)
		{
			System.out.println("Employee Id : "+emp[i].empNo+"\nEmployee Name : "+emp[i].name+"\n-----------------------------------");
		}
	}

}
