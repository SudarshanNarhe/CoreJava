package com.problems;

public class ObjectCreation {
     
	private int dd,mm,yy;
	
	public void setData(int d, int m, int y)
	{
		dd=d;
		mm=m;
		yy=y;
	}
	public void printDate()
	{
		System.out.println("Date is "+dd+"/"+mm+"/"+yy);
	}
	
	public static void main(String[] args) {
		
		//object creation
		
		//1st method
		
		//ObjectCreation obj;
		//obj=new ObjectCreation();
		
		// 2nd method 
		
		ObjectCreation obj1=new ObjectCreation();
		obj1.printDate();
		obj1.setData(16, 10, 2023);
		obj1.printDate();
		

	}

}

