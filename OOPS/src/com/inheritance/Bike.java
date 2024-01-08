package com.inheritance;

/*WAP to create class Bike with fields color ,speed and  method bikeInfo()
which is show color and speed of bike.
create class Pulsar which extends Bike implement bikeInfo() differently child */


public class Bike {
	
	String colour;
	int speed;
	
	public Bike()
	{
		
	}
	public void bikeInfo(String colour, int speed)
	{
		this.colour=colour;
		this.speed=speed;
	}

	@Override
	public String toString() {
		return "Bike [colour=" + colour + ", speed=" + speed + "]";
	}
	public static void main(String[] args) {
			
	}

}

	