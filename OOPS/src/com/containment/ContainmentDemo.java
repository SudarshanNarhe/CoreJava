package com.containment;

public class ContainmentDemo {
	//data member 
	private int dd, mm, yy;
	
	public  ContainmentDemo()
	{
		System.out.println("I am in defualt Constructor...");
		this.dd=17;
		this.mm=10;
		this.yy=2023;
	}
	public ContainmentDemo(int d, int m, int y)
	{
		System.out.println("I am in Parameterized Costructor");
		dd=d;
		mm=m;
		yy=y;			
	}
	public void setDd(int d)
	{
		dd=d;
	}
	public int getDd()
	{
		return dd;
	}
	public void setMm(int m)
	{
		mm=m;
	}
	public int getMm()
	{
		return mm;
	}
	public void setYy(int y)
	{
		yy=y;
	}
	public int getYy()
	{
		return yy;
	}
	public String toString ()
	{
		return "Date is : "+dd+"/"+mm+"/"+yy;
	}
	
	public static void main(String[] args) {
		
		//object creation
		ContainmentDemo obj=new ContainmentDemo(18,12,2023);
				System.out.println(obj);
				obj.setDd(19);
				obj.setMm(12);
				obj.setYy(2023);
				System.out.println("I am in main.");
				System.out.println(obj);
		
	}

}
