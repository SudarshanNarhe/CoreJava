package com.oops;

public class CheckHashcode {

	int roll;
	String name;
	
	public CheckHashcode() {
		
	}
	public CheckHashcode(int r, String name) {
		
		roll=r;
		this.name=name;
	}
	
	public static void main(String[] args) {
	
		CheckHashcode obj = new CheckHashcode();
		System.out.println("Hashcode of object with Default Constructor : "+obj.hashCode());
		
		CheckHashcode obj1 = new CheckHashcode(23, "Munna");
		System.out.println("Hashcode of object with para Constructor : "+obj1.hashCode());
		
		CheckHashcode obj2 = obj1;
		System.out.println("HashCode : "+obj2.hashCode());
		
	}

}
