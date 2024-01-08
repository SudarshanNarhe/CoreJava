package com.inheritance;

public class TV extends ElectronicDevice {

	private int modelno;
	private int size;
	
	public TV() {
		this.modelno=0;
		this.size=0;
	}
	public TV(int srn, String name, MyDate d, String os, double price,int modelno,int size)
	{
		super(srn,name,d,os,price);
		this.modelno=modelno;
		this.size=size;
	}
	public String toString()
	{
	    return	super.toString()+"\nModel no :"+modelno+"\nSize : "+size+"inch";
	}

	public static void main(String[] args) {
		
		TV t= new TV(12,"Samsung",new MyDate(12,8,2022),"Android",30000,783,32);
		System.out.println(t);
		
	}

}
