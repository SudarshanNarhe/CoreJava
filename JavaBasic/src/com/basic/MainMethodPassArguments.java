package com.basic;

public class MainMethodPassArguments {

	public static void sum(int a, int ...b) {
		int sum=0;
		for(int c : b) {
			sum=sum+c;
		}
		sum=sum+a;
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		
		System.out.println(args[0]);
		System.out.println(args[1]);
		
		sum(1,2,3,4,5,15,10,50,10);
	}
	
}
