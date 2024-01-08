package com.inheritance;

/*WAP to create class Vehicle with methods accelerate(long mph)
with long type parameter ,stop(),run() all method return string type of value.
Create class car which extends Vehicle implement accelerate(long mph)differently in car class.*/

public class Car extends Vehicle{

	public Car()
	{
		
	}
	@Override
	public void accelerate(long mph)
	{
		super.accelerate(120);
	}
	
	public static void main(String[] args) {
		
		Vehicle obj= new Car();
		obj.accelerate(130);
		System.out.println(obj);
		obj.Compare();
	
	}

}
