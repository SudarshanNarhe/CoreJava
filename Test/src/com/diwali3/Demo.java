package com.diwali3;

public class Demo {
	
	public static void main(String[] args)
	{	
		Car c1 = new Car();
		Car.color = "Blue";
		//System.out.println("2 "+c1.color);
		changeColor(c1);
		//System.out.println("3 "+c1.color);
		Car.color="Pink";
		//System.out.println("4 "+c1.color);
		System.out.println(Car.color);
		System.out.println(Car.color);
	}
	
	public static void changeColor(Car c1) {
		Car.color = "Yellow";
		//System.out.println("in method "+c1.color);
	}
	
}
class Car {
	String name;
	static String color = "White";}
