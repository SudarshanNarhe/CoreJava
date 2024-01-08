package com.diwali2;

public class Que1 {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.color = "Blue"; 
		System.out.println("First object  "+c1.color);
		Car c2=new Car();
		c2.changeColor(c1);
		System.out.println("Second object  "+c1.color);
		c2.color="Pink";
		System.out.println(c1.color);
		System.out.println(c2.color);

	}

}

class Car {
	
	String color;
	
	public void changeColor(Car c2) {
		//System.out.println("In car Class  "+color);
		c2.color=color;
		color="Red";
		//System.out.println("In car Class 2nd "+color);
	}
	
}
