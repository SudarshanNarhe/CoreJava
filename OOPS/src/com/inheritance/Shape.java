package com.inheritance;

/*WAP to create class shape with method draw().
create class circle, square, Rectangle which extends Shape implement draw() differently in each child.*/


public class Shape {

	public Shape()
	{
		
	}
	public void draw()
	{
		System.out.println("Draw");
	}

	public static void main(String[] args) {
		

	}

}

class Circle extends Shape
{
	
	public Circle()
	{
		
	}
	@Override
	public void draw()
	{	
		System.out.println("In Circle");
		super.draw();
	}
	
	public static void main (String []args)
	{
		Circle obj= new Circle();
		//obj.draw();
		
		Shape obj1= new Rectangle();
		//obj1.draw();
		
		Shape obj2 = new Square();
		//obj2.draw();
		
		if (obj1 instanceof Rectangle)
		{
			obj1.draw();
		}
		else if(obj2 instanceof Square)
		{
			obj2.draw();
		}
		else 
		{
			obj.draw();
		}
	}
	
}

