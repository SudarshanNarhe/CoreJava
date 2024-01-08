package com.diwali5;

public class Output1 {

	public static void main(String[] args) {
		
		String str = "something";
		String str2 = str.intern();
		String str3 = new String("something");
		String str4 = str3.intern();
		
		System.out.println(str2==str4); // it shows the true because it refer a same object which create in String pool
		
		System.out.println(str.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode()); 
		System.out.println(str4.hashCode());
		// It will show the same hashCode because only one object is create in memory heap and other all are refers to same in String pool
		System.out.println(str2.hashCode()==str3.hashCode()); 
		

	}

}
