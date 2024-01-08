package com.abstract_Code;

public class Square extends Shape{
	
	double side;
	double area;
	double volume;
	
	public Square() {
		this.side=0;
		this.area=0;
		this.volume=0;
	}
    public Square(double side) {
		
    	this.side=side;
	}

	@Override
	public double calArea() {
		// TODO Auto-generated method stub
		return area= side*side;
	}
	@Override
	public double calVolume() {
		// TODO Auto-generated method stub
		return volume=side*side*side;
	}
	
	
	@Override
	public String toString() {
		return "Area of a Sqaure : "+area+"\nVolume of Square : "+volume;
	}
	public static void main(String[] args) {
		
		Square sq= new Square(5.6);
		sq.calArea();
		sq.calVolume();
		
		System.out.println(sq);
	}

}
