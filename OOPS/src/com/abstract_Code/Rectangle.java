package com.abstract_Code;

public class Rectangle extends Shape{
	
	double length;
	double width;
	double height;
	double area;
	double volume;
	
	public Rectangle() {
		this.length=0;
		this.width=0;
		this.height=0;
		this.area=0;
		this.volume=0;
	}
	public Rectangle (double l, double w, double h)
	{
		this.length=l;
		this.width=w;
		this.height=h;
	}

	@Override
	public double calArea() {
		// TODO Auto-generated method stub
		return area=length*width;
	}

	@Override
	public double calVolume() {
		// TODO Auto-generated method stub
		return volume=length*width*height;
	}
	
	@Override
	public String toString() {
		return "Area of a Sqaure : "+area+"\nVolume of Square : "+volume;
	}
	public static void main(String[] args) {
		
		Rectangle rc = new Rectangle(12.5,7.5,4.3);
		rc.calArea();
		rc.calVolume();
		System.out.println(rc);
		System.out.println("_______________________________________________________");
		
		Shape arr[]=new Shape[6];
		arr[0]=new Circle(5.6);
		arr[1]=new Triangle(3.4,6.5);
		arr[2]=new Rectangle(4.5,12,9.6);
		arr[3]=new Square(15.3);
		arr[4]=new Circle(7.9);
		arr[5]= new Rectangle(5,7,3.6);
	
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] instanceof Circle)
			{
				System.out.println("Circle");
				System.out.println(arr[i].calArea());
				System.out.println(arr[i].calVolume());
			}
			else if(arr[i]instanceof Triangle)
			{
				System.out.println("Triangle");
				System.out.println(arr[i].calArea());
				System.out.println(arr[i].calVolume());
			}
			else if(arr[i]instanceof Rectangle)
			{
				System.out.println("Rectangle");
				System.out.println(arr[i].calArea());
				System.out.println(arr[i].calVolume());
			}
			else 
			{
				System.out.println("Square");
				System.out.println(arr[i].calArea());
				System.out.println(arr[i].calVolume());
			}
			
			
		}
		
		
	}
	

}
