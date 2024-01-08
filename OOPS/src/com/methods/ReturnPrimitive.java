package com.methods;

public class ReturnPrimitive {

	private int dd, mm, yy;
	
	public void setData(int a, int b, int c)
	{
		dd=a;
		mm=b;
		yy=c;
	}
	
	public void display()
	{
		System.out.println("Date is "+dd+"/"+mm+"/"+yy);
	}
	
	public ReturnPrimitive getObject()
	{
		this.dd=20;
		this.mm=7;
		this.yy=2023;
		return this;
//		dd=10;
//		mm=5;
//		yy=2022;
//	
//		return new ReturnPrimitive();
	}
	
	public static void main(String[] args) {
		
		ReturnPrimitive bjp=new ReturnPrimitive();
		bjp.setData(15, 10, 2023);
		bjp.display();
		
		ReturnPrimitive abc=bjp.getObject();
			abc.display();
			bjp.display();

	}

}
