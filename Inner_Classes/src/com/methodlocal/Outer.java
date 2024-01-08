package com.methodlocal;

public class Outer {
	
	int outer_n;
	
	public Outer() {
		outer_n=10;
	}
	
	public void show() {
		// This class is only for within a class
	     class Inner {
			int inner_n;
			public Inner() {
				inner_n=20;
			}
			public void show() {
				System.out.println(outer_n);
				System.out.println(inner_n);
			}
		}
		Inner in= new Inner();
		in.show();
		
	}
	
	public static void main(String[] args) {
		
		Outer o = new Outer();
		o.show();
		
	}
	
}
