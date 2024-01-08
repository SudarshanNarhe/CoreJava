package com.ifelse;

public class FloatingPoint {

	public static void main(String[] args) {
	      float num1 = 0.001f , num2 = 0.0098f, diff;
		  diff = (num1 - num2);
		//System.out.println(diff);
		if (diff==0)
		{
			System.out.println("The number is closest to the zero");
		} else {
			System.out.println("The number is not closest to the zero");
		}

	}

}
