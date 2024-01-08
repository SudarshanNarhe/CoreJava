package com.operators;

public class MathOperator {

	public static void main(String[] args) {
		int a = 5, b = 4, c = 3;
		System.out.println(a++ +b * ++c);
		System.out.println("a="+a + " b=" +b + " c="+c);
		System.out.println(b*5/a + b++ +b); // if we use a float as typecasting then ans will be 12.333
		System.out.println("a=" +a + " b="+b + " c="+c);

	}

}
