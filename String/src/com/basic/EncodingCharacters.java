package com.basic;

import java.util.Scanner;


// Encode all characters by its next third character...

public class EncodingCharacters {

	public static void encoding(String name)
	{
		char ch[]= name.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]<'x')
			{
				ch[i]=(char) (ch[i]+3);
			}
			else
				ch[i]=(char) (ch[i]-23);
		}
		String encodingName= new String (ch);
		System.out.println(encodingName);
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your name : ");
		String name= sc.next();
		encoding(name);
		
sc.close();
	}

}
