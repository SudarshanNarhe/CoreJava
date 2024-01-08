package com.basic;

public class ConvertingDistance {

	public static void main(String[] args) {
		float cm, m, km;
		cm = 50f;
		m = (float)(0.01*cm);
		km = (float)(0.00001*cm);
		System.out.println("The meter is : "+m);
		System.out.println("The kilometer is :"+km);

	}

}
