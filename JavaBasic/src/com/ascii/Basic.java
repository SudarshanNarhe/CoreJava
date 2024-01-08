package com.ascii;

public class Basic {

	public static void main(String[] args) {
		char ch = 'A';
		System.out.println(ch);
		System.out.println(+ch);// by adding it converts char into integer 
		
		int ascii= ch;
		System.out.println(ascii);
		
		int value = 48;
		char ch1 =(char) value;
		System.out.println(ch1);
		
		char c1='0';
		char c2='1';
		
		int sum= c1+c2;
		System.out.println("Sum is :"+sum);
		
		char sum1 = (char) (c1+c2);
		System.out.println(sum1);
		
		char ch6='$';
		System.out.println((int)ch6);
		
		int val=195;
		System.out.println((char)val);

	}

}
