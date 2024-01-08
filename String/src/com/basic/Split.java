package com.basic;

//WAP to split string into 2 tokens where string is “HELLO$WORLD”

public class Split {

	public static void main(String[] args) {
		
		String str = new String("HELLO$WORLD");
		String str1[]= str.split("\\$", 2);
		
		for(String ss : str1)
			System.out.println(ss);
		
		//By Logic 
		System.out.println("By Logic : ");
		char ch[]= str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='$')
			{	
				System.out.println();
				continue;
			}
			System.out.print(ch[i]);
		}

	}

}
