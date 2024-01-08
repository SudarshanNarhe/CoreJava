package com.inheritance;

/*WAP to create class Programmer with Method workingHours().
create class Employee which extends Programmer implement workingHours()differently in child*/

public class EmployeePr extends Programmer{

	public EmployeePr() 
	{
		
	}
	
	@Override
	public void workingHours(int hr)
	{
		super.workingHours(hr);
	}
	
	@Override
	public String toString() {
		return super.toString();
	}

	public static void main(String[] args) {
		
		EmployeePr obj = new EmployeePr();
				obj.workingHours(8);
		System.out.println(obj);

	}

}
