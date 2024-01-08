package com.basic;

//Write a Java program to find length of a string.

public class FindLength {

	
	public static void main(String[] args) {
		
		String s ="Sudarshan@Narhe";
		
		char ch[]=s.toCharArray();
		
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
			count++;
		}
		System.out.println("By Coding : "+count);
		System.out.println("By String Class : "+s.length());
		
	}

}
