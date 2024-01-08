package com.SimpleInnerClass;

public class Outer {

	int outer_n;
	int data=100;
//	Outer.Inner ss = new Outer().new Inner();
	public Outer() {
		outer_n=1001;
	}
	public Outer(int outer_n) {
		this.outer_n=outer_n;
	}
	
	public void showOuterData() {
		System.out.println("Outer Class Data is "+outer_n);
	//	System.out.println(ss.inner_n);
	}
	
	public class Inner {
		
		int inner_n=30;
		int data=999;
		
		public Inner() {
			inner_n=2001;
		}
		public Inner(int inner_n) {
			this.inner_n=inner_n;
		}
		public void showInnerData() {
			
			System.out.println("Inner Class Data is "+inner_n);
			System.out.println("Outer Class Data is "+outer_n); // to access the outer class data 
			System.out.println(this.data); // it will give the inner class data
			System.out.println(Outer.this.data); // to access the outer class data having same data variables 
		}
		
	}
	
	public static void main(String[] args) {
		
		Outer obj = new Outer();
		
		//1. to call inner class 
		Outer.Inner in = obj.new Inner();
		in.showInnerData();
		
		//2. to call inner class
		Outer.Inner in2 = new Outer().new Inner();
		in2.showInnerData();
		
		
	}
	
}
