package com.methodArguments;

public class Outer {
	
	int data_n=10;
	
	public Outer() {
		
	}
	public void showData(Demo obj) {
		
		obj.show();
	}
	
	public static void main(String[] args) {
		
		//1. to call the method
		Outer obj= new Outer();
//		Demo d = new Demo();
//		obj.showData(d);
		
		//2. to call the method 
		obj.showData(new Demo() {
			
			//Anonymous Sub Class Demo
			public void show() {
				super.show();;
				System.out.println("IN ANO");
			}
			
		});
		
	}
	
}

class Demo {
	
	int data=10;
	
	public Demo() {
		
	}
	
	public void show() {
		
		System.out.println("In show of demo class");
	}
	
}
