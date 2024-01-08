package com.AccessModifiers;

public class Class1 {

	public static void main(String[] args) {
		
		A obj = new A();
		System.out.println(obj.i);
		System.out.println(obj.k);
		System.out.println(obj.l);
		//System.out.println(obj.j);   j is not available because it is private to access it we required a  public getter and public setter method
		

	}

}
