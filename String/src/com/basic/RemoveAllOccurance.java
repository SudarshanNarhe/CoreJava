package com.basic;

//Write a Java program to remove all occurrences of a character from string.

public class RemoveAllOccurance {

	public static void main(String[] args) {
		
		String str ="HelloWorld";
		
		char ch[]=str.toCharArray();
		char oc='l';
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==oc)
			{
				ch[i]=' ';
			}
		}
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==' ')
			{
				continue;
			}
			System.out.print(ch[i]);
		}
		
	}

}
