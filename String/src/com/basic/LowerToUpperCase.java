package com.basic;

//Write a Java program to convert lowercase string to uppercase

public class LowerToUpperCase {

	public static void main(String[] args) {
		
		String str = "sudarshan";
		System.out.println("By Build Method : "+str.toLowerCase());
		char ch[] = str.toCharArray();
		System.out.println("Lower to Upper Case : ");
		for (int i=0;i<ch.length;i++)
		{
			if(ch[i]>='a'&& ch[i]<='z')
			{
				ch[i] = (char) (ch[i]-32);
			}		
		}
		
		for(char a : ch)
			System.out.print(a);
		
		String str1 = "SUDARSHAN";
		System.out.println("\nBy Build Method : "+str1.toUpperCase());
		char ch1 []= str1.toCharArray();
		System.out.println("Upper to Lower Case : ");
		for(int i=0;i<ch1.length;i++)
		{
			if(ch1[i]>='A' && ch1[i]<='Z')
			{
				ch1[i]= (char) (ch1[i]+32);
			}
		}
		for(char b : ch1)
			System.out.print(b);
	}

}
