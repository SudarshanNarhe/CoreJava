package com.problems;

public class ParameterizedConstructor {
	
	private int dd;
	private int mm;
	private int yy;
	
	public ParameterizedConstructor(int d,int m,int y)
	{
		
		dd=d;
		mm=m;
		yy=y;
		System.out.println("The default value is : "+dd+"/"+mm+"/"+yy);
	}

	public void setData(int d, int m, int y)
	{
		dd=d;
		mm=m;
		yy=y;
	}
	public void display()
	{
		System.out.println("The date is : "+dd+"/"+mm+"/"+yy);
	}
	
	public static void main(String[] args) {
		
		ParameterizedConstructor obj= new ParameterizedConstructor(18,12,2023);
		obj.setData(15, 10, 2023);
		obj.display();
		
	}

}
