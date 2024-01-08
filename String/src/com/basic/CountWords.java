package com.basic;

//Write a Java program to count total number of words in a string.

public class CountWords {

	public static void main(String[] args) {
		
		String str = " Aadarsh is a Good Boy";
		
		//By Logic...
		int count=0;
		char ch []= str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==32)
			{
				continue;
			}
			count++;
		}
		System.out.println("By Logic : "+count);
	}

}
