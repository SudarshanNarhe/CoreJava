package com.diwali_2;

public class DivisibleBy3and9 {

	public static void main(String[] args) {
		
		
		for(int i=1;i<=100;i++) {
			
			if(i%9==0) {
				System.out.println("hello");
			}
			else if(i%3==0) {
				System.out.println("hi");
			}
			else
				System.out.println(i);
		}

	}

}
