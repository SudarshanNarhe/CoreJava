package com.inheritance;

/*WAP to create class Programmer with Method workingHours().
create class Employee which extends Programmer implement workingHours()differently in child*/

public class Programmer {
	
	int hr;
	
	public Programmer() 
	{
		
	}
	public void workingHours(int hr)
	{
		this.hr=hr;
	}
	
	@Override
	public String toString() {
		return "Employee Working [hr=" + hr + "]";
	}
	

}
