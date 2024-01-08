package com.Anonymous;


public class Outer {

	Demo d =new Demo() {
		
		int ai=20;
		{
			System.out.println("In instance INIT block");
		}
		public void show() {
			
			super.show();
			System.out.println("In Outer Show "+ai);
			newMethod();  //we can only call the overridden method to call the new methods we have to call from overridden methods
		}
		public void newMethod() {
			System.out.println("in new method");
		}
		
	};
	
	Myinterface ii= new Myinterface() {
		
		@Override
		public void test() {
			// TODO Auto-generated method stub
			System.out.println("IN Myinterface Outer");
		}
	};
	
	public void show() {
		System.out.println("In outer Show Outerrrrrrrrr");
	}
	
	public static void main(String[] args) {
		Outer o = new Outer();
		o.d.show();
		o.ii.test();
		o.show();
		
		
		
	}
	
}

class Demo{
	
	int data = 100;
	
	public Demo() {
		
	}
	
	public void show() {
		
		System.out.println("IN DEMO...");
		
	}
	
}

interface Myinterface{
	
	public void test();
	
	
}