package com.methods;

public class StringUse {

	int dd;
	int mm;
	int yy;
	
	public void setData(int d, int m, int y)
	{
		dd=d;
		mm=m;
		yy=y;
				
	}
	
//	public void display()
//	{
//		System.out.println("The date is : "+dd+"/"+mm+"/"+yy);
//	}
	public String toString()
	{
		return dd+"/"+mm+"/"+yy;
	}
	
	public static void main(String[] args) {
		
		StringUse obj=new StringUse();
		obj.setData(12, 11, 2023);
		
		System.out.println(obj);
		
	}

}
