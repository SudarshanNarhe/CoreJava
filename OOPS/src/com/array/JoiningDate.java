package com.array;

/*WAP to print the employees from Employee[] array who has same joining date.
You have Employee class which has 4 attributes id, name, salary, date
(date is another object which has 3 attributes day, month, year) and 
add employee objects to your array*/


public class JoiningDate {

	private int dd;
	private int mm;
	private int yy;
	
	public JoiningDate()
	{
		
	}
	public JoiningDate(int dd, int mm, int yy)
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
	public boolean CompareDate(JoiningDate obj1)
	{
		if(this.dd==obj1.dd && this.mm==obj1.mm && this.yy==obj1.yy)
		{
			return true;
		}
		else 
			return false;
	}
	public String toString()
	{
		return dd+"/"+mm+"/"+yy;
	}
	
	public static void main(String[] args) {
		
		
	
	}

}
	
