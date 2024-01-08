package com.inheritance;
/*WAP to create class Vehicle with methods accelerate(long mph)
with long type parameter ,stop(),run() all method return string type of value.
Create class car which extends Vehicle implement accelerate(long mph)differently in car class.*/



public class Vehicle {
	
		long mph;
		
	public Vehicle()
	{
		
	}
	public void accelerate(long mph)
	{
		this.mph=mph;
	}
	public void Compare()
	{
		if(mph==0)
		{
			System.out.println("Stop");
		}
		else
		{
			System.out.println("Run");
		}
	
	}
	
	@Override
	public String toString() {
		return "Vehicle [mph=" + mph + "]";
	}
	public static void main(String[] args) {
	
	}

}
