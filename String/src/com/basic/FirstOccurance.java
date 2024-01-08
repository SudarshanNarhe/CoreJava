package com.basic;

//Write a Java program to find first occurrence of a character in a given string.
//Write a Java program to count occurrences of a character in given string


public class FirstOccurance {

	public static void main(String[] args) {

		String str = "sudarshan";
		
		
		//Method...
		System.out.println("By Method : "+str.indexOf('a'));
		
		char ch[]=str.toCharArray();
		
		//Logic...
		char s='a';
		for(int i=0;i<ch.length;i++)
		{
				if(ch[i]==s)
				{	
					System.out.println("By Logic : "+i);
					break;
				}
		}
		
		
		//Count By Logic
		int count=0;
		for(int i=0;i<ch.length;i++)
		{	
			if(ch[i]==s) 
			{
				count++;
			
			}
		}
		System.out.println("Count is : "+count);
	
		
		
		
	}
}


