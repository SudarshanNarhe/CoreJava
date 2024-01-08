package com.inheritance;

public class Rectangle extends Shape{

		public Rectangle()
		{
			
		}
		@Override
		public void draw()
		{	
			System.out.println("In Rectangle");
			super.draw();
		}
		
		public static void main (String []args)
		{
			Shape obj1= new Rectangle();
			obj1.draw();
			
			Shape obj2 = new Square();
			obj2.draw();
			
			Shape obj3 = new Circle();
			obj3.draw();
		}
		
	}