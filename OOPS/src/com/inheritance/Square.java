package com.inheritance;

class Square extends Shape
{
	
	public Square()
	{
		
	}
	@Override
	public void draw()
	{	
		System.out.println("In Square");
		super.draw();
	}
	
	public static void main (String []args)
	{
		Shape obj1= new Square();
		obj1.draw();
	}
	
}
