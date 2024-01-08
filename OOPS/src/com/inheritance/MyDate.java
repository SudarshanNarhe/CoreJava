package com.inheritance;

public class MyDate {

	private int dd;
	private int mm; 
	private int yy;
	
	public MyDate ()
	{
		
	}
	public MyDate(int dd,int mm, int yy)
	{
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}
	public void setDD(int dd)
	{
		this.dd=dd;
	}
	public int getDD()
	{
		return dd;
	}
	public void setMM(int mm)
	{
		this.mm=mm;
	}
	public int getMM()
	{
		return mm;
	}
	public void setYY(int yy)
	{
		this.yy=yy;
	}
	public int getYY()
	{
		return yy;
	}
	public String toString()
	{
		return dd+"/"+mm+"/"+yy;
	}
	
	public static void main(String[] args) {
		
		MyDate d=new MyDate(12,5,2023);
		System.out.println(d);
		
		
	}

}
