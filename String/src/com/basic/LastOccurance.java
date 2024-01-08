package com.basic;

//Write a Java program to find last occurrence of a character in a given string.

public class LastOccurance {

	public static void main(String[] args) {
		
		String str = "Sudarshan";
		
		char ch []=str.toCharArray();
		char oc = 'a';
		// we can use a for loop as forward direction but we have to remove that break statement. 
		for(int i=ch.length-1;i>=0;i--)
		{
			if(ch[i]==oc)
			{
				System.out.println(i);
				break;
			}
		}

	}

}
