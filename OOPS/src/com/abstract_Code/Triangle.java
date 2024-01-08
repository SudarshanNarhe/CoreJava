package com.abstract_Code;

public class Triangle extends Shape{
	
	double base;
	double height;
	double area;
	double volume;
	
	public Triangle() {
		this.base=0;
		this.height=0;
		this.area=0;
		this.volume=0;
	}
	public Triangle (double base , double height)
	{
		this.base=base;
		this.height=height;
	}
	@Override
	public double calArea() {
		// TODO Auto-generated method stub
		return area=(base*height*1)/2;
	}
	@Override
	public double calVolume() {
		// TODO Auto-generated method stub
		return volume=base*height;
	}
	
	@Override
	public String toString() {
		return "Area of a Sqaure : "+area+"\nVolume of Square : "+volume;
	}
	public static void main(String[] args) {
		
		Triangle tr= new Triangle(10,7.8);
		tr.calArea();
		tr.calVolume();
		System.out.println(tr);
	
	}
	
}
