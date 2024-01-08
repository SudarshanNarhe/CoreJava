package com.interface_Code;

public class Demo implements Printable{

	public Demo()
	{
		
	}
	@Override
	public void show() {
		
		System.out.println("I am in Demo Class");
	}

	public static void main(String[] args) {
		
		Demo obj= new Demo();
		Printable p= new Demo();
		obj.show();
		p.show();
		System.out.println(Printable.n);
		
	}

	
	
}
