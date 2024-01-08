package com.inheritance;

public class Computer extends ElectronicDevice{

	private int ram;
	private int storage;
	
	public Computer()
	{
		this.ram=0;
		this.storage=0;
	}
	public Computer(int srn, String name, MyDate d, String os, double price,int ram,int storage)
	{
		super(srn,name,d,os,price);
		this.ram=ram;
		this.storage=storage;
	}
	@Override
	public String toString()
	{
		return super.toString()+"\nRam :"+ram+"gb"+"\nStorage : "+storage+"gb";
	}
	public static void main(String[] args) {
		
		Computer ce=new Computer(324,"LG",new MyDate(23,7,2019),"Windows",35000,8,128);
		System.out.println(ce);
		
		
	}

}
