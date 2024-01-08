package com.operators;

public class LogicalOperators {

	public static void main(String[] args) {
		int num = 78;
		System.out.println((num>70)&&(num<80));
		System.out.println((num>70)&&(num<60));
		System.out.println((num>70)||(num<80));
		System.out.println((num>70)||(num<60));
		System.out.println((num>80)||(num<60));
		System.out.println(!(num>70));// ! = not it just reverse the condition
		System.out.println(!(num<70));

	}

}
