package com.abstract_Code;

public class Circle extends Shape{

	double r;
	final double pi=3.1415;
	double area;
	double volume;
	public Circle ()
	{
		this.r=0;
		this.area=0;
		this.volume=0;
		
	}
	
	public Circle(double r)
	{
		this.r=r;
	}

	@Override
	public double calArea() {
		
		return area=pi*r*r;
	}

	@Override
	public double calVolume() {
		
		return volume=(4*pi*r*r*r)/3;
	}
	
	
	@Override
	public String toString() {
		return "Area of a circle : "+area+"\nVolume of Circle : "+volume;
	}

public static void main(String[] args) {
		
	Circle obj = new Circle(4.5);
	obj.calArea();
	obj.calVolume();
	
	System.out.println(obj);
	
	
	}

	
}
