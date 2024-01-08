package com.inheritance;

public class Mobile extends ElectronicDevice{

	private int camera;
	private int battery;
	
	public Mobile()
	{
		this.battery=0;
		this.camera=0;
	}
	public Mobile(int srn, String name, MyDate d, String os, double price,int cam, int bat)
	{	
		super(srn,name,d,os,price);
		camera=cam;
		battery=bat;
	}
	@Override
	public String toString()
	{
		return super.toString()+"Battery : "+battery+"mAh"+"\nCamera : "+camera+"mp";
	}
	
	
	
	public static void main(String[] args) {
		
		Mobile m=new Mobile(43,"Samsung",new MyDate(23,9,2023),"Android 13",18000,67,5000);
		System.out.println(m);
		
	}

}
