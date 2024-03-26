package com.SingleTon;

public class CheckSingleTone {

	public static void main(String[] args) {
		
		SingleTone first = SingleTone.getInstance();
		SingleTone two = SingleTone.getInstance();

		System.out.println(first.hashCode());
		System.out.println(two.hashCode());
		
		System.out.println("Both objects are equal : "+(first.hashCode()==two.hashCode()));
	
	}

}
