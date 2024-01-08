package com.methods;

public class SwapValueInStatic {

	int dd;
	int mm;
	int yy;

	
	public SwapValueInStatic(int d, int m, int y)
	{
		dd=d;
		mm=m;
		yy=y;
				
	}
	public static void swap(SwapValueInStatic d1,SwapValueInStatic d2)
	{
		SwapValueInStatic temp=d1;
		d1=d2;
		d2=temp;
		d1.display();
		d2.display();
	}
	
	public void display()
	{
		System.out.println("The date is : "+dd+"/"+mm+"/"+yy);
	}
	
	
	public static void main(String[] args) {
		
		SwapValueInStatic obj1=new SwapValueInStatic(18,10,2022);
		SwapValueInStatic obj2= new SwapValueInStatic(19,11,2023);
		obj1.display();
		obj2.display();
		
		swap(obj1,obj2);
		
	}

}
