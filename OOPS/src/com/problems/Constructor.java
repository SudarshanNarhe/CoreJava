package com.problems;

public class Constructor {

	public Constructor()
	{
		dd=17;
		mm=10;
		yy=2023;
		System.out.println("Default Date is : "+dd+"/"+mm+"/"+yy);
	}
	 
	private int dd,mm,yy;
	public void setData(int d, int m, int y)
	{
		dd=d;
		mm=m;
		yy=y;
	}
	public void display()
	{
		System.out.println("Date is : "+dd+"/"+mm+"/"+yy);
	}
	
	public static void main(String[] args) {
		
		Constructor obj=new Constructor ();
		obj.setData(23, 2, 2023);
		obj.display();
		
		
	}

}
