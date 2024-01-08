package com.inheritance;

/*. Create Class Laptop which has variables noOfUSBPort, processorSpeed of 
type int. Create getter, setter methods for the variables. In main method, 
1> create Laptop object 2> set values of variables noOfUSBPort, 
processorSpeed using setter methods. 3> print variables noOfUSBPort, 
processorSpeed using getter methods*/



public class Laptop {
	
	private int noOfUSBPort;
	private int processorSpeed;
	
	public Laptop()
	{
		System.out.println("Im in default const...");
	}
	public Laptop(int usb, int speed)
	{
		this.noOfUSBPort=usb;
		this.processorSpeed=speed;
	}
	public void setnoOfUSB(int usb)
	{
		this.noOfUSBPort=usb;
	}
	public int getnoOfUSB()
	{
		return noOfUSBPort;
	}
	public void setprocessorSpeed(int speed)
	{
		this.processorSpeed=speed;
	}
	public int getprocessorSpeed()
	{
		return processorSpeed;
	}
	@Override
	public String toString()
	{
		return "No Of USB ports are : "+noOfUSBPort+"\nThe Speed of Processor : "+processorSpeed;
	}
	
	public static void main(String[] args) {
		
		Laptop obj= new Laptop();
		obj.setnoOfUSB(3);
		obj.setprocessorSpeed(40);
		System.out.println(obj);
		
	}

}
