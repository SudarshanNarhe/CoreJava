package com.inheritance;

public class ElectronicDevice
{
	private int serialno;
	private String name;
	private MyDate d;
	private String os;
	private double price;
	
	public ElectronicDevice()
	{
		
	}
	public ElectronicDevice(int srn, String name, MyDate d, String os, double price)
	{
		this.serialno=srn;
		this.name=name;
		this.d=d;
		this.os=os;
		this.price=price;
	}
	public void setSerialNo(int srn)
	{
		this.serialno=srn;
	}
	public int getSerialNo()
	{
		return serialno;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setOS(String os)
	{
		this.os=os;
	}
	public String getOS()
	{
		return os;
	}
	public void setPrice(double price)
	{
		this.price=price;
	}
	public double getPrice()
	{
		return price;
	}
	@Override
	public String toString()
	{
		return "Device name :"+name+"\nSerial No : "+serialno+"\nDate Of Manufacturing : "+d+"\nOperating System : "+os+"\nPrice : "+price;
	}
	
	public static void main(String[] args) {
		
		ElectronicDevice ed= new ElectronicDevice(123,"Lenovo",new MyDate(23,7,2023),"Windows",80000);
		System.out.println(ed);

	}

}
