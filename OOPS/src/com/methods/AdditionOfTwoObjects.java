package com.methods;

public class AdditionOfTwoObjects {
	
	private int dd, mm, yy;

	
	public void setData(int d,int m, int y)
	{
		dd=d;
		mm=m;
		yy=y;
	}
	public void display ()
	{
		System.out.println("The date is : "+dd+"/"+mm+"/"+yy);
	}
	public void add(AdditionOfTwoObjects obj1)
	{
		System.out.println(this.dd);
		System.out.println(this.mm);
		System.out.println(this.yy);
		
		int add=this.dd+obj1.dd;
		System.out.println("The Addition is :");
		System.out.println(add);
		int add2=this.mm+obj1.mm;
		System.out.println(add2);
		int add3=this.yy+obj1.yy;
		System.out.println(add3);
		
		 
		
	}
	
	public static void main(String[] args) {
		
		AdditionOfTwoObjects obj1=new AdditionOfTwoObjects();
		AdditionOfTwoObjects obj2=new AdditionOfTwoObjects();
		obj1.setData(10, 11, 2023);
		obj2.setData(9, 10, 2023);
		obj1.display();
		obj2.display();
        
		obj2.add(obj1);   // obj2.= obj2.+obj1. (Short hand)
		
	}

}
