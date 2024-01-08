package com.basic;

//Write a Java program to count total number of vowels and consonants in a string.

public class VowelsAndConsonant {
	
	public static void countVowels(String name)
	{
		char ch[]= name.toCharArray();
		int count=0;
		int count1=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
			{
				count++;
			}
			else if(ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U')
			{
				count++;
			}
			else
				count1++;
		}
		System.out.println("Total Number of Characters : "+(count+count1));
		System.out.println("Number of Vowels is : "+count);
		System.out.println("Number of Consonants is : "+count1);
			
	}
	
	public static void main(String[] args) {
		
		String str="AadarshIejsnshwhosi";
		countVowels(str);

	}

}
