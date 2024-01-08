package com.containment;

//mydate has (day, month, year).

public class MyDate {

	private int dd;
	private int mm;
	private int yy;
	
	public MyDate()
	{
		
	}
	public MyDate(int dd, int mm, int yy)
	{
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}
	public void setDate(int dd)
	{
		this.dd=dd;
	}
	public int getDate()
	{
		return dd;
	}
	public void setMonth(int mm)
	{
		this.mm=mm;
	}
	public int getMonth()
	{
		return mm;
	}
	public void setYear(int yy)
	{
		this.yy=yy;
	}
	public int getYear()
	{
		return yy;
	}
	public String toString()
	{
		return  dd+"/"+mm+"/"+yy;
	}
	
	public static void main(String[] args) {
		
		MyDate obj=new MyDate(18,11,2023);
		System.out.println(obj);

	}

}
