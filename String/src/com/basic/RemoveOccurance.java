package com.basic;

//Write a Java program to remove first occurrences of a character from string.


public class RemoveOccurance {

	public static void main(String[] args) {
		
		String str = "HelloWorld";
		
		char cr ='l';
		char ch1[]=str.toCharArray();
		
		int j=0;
		for(int i=0;i<str.length();i++)
		{
				if(cr==ch1[i])
				{	
					j=i;
					break;
				}
		}
		
		char []ch = new char [str.length()-1];
		int k=0;
		for(int i=0;i<ch1.length;i++)
		{
			if(i!=j)
			{
				ch[k++]=ch1[i];
			}
			
		}
		String str1= new String (ch);
		System.out.println(str1);
		
	}

}
