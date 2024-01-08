package com.diwali_2;

public class Power {

	public static void checkPower(int base, int expo) {
		int power=1;
		
		for(int i=1;i<=expo;i++) {
			power=power*base;
		}
		System.out.println(power);
	}
	
	public static void main(String[] args) {
		
		checkPower(4, 3);
		
	}

}
