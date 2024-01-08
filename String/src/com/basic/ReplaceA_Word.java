package com.basic;

import java.util.Arrays;
import java.util.Scanner;

//Replace the particular word from string by another string.

public class ReplaceA_Word {

	public static void main(String[] args) {
		
		String str = "I am Python Developer";
		System.out.println(str);
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a word to be replace : ");
		String rep=sc.next();
		System.out.println("Enter a word you have to enter in given data : ");
		String str1=sc.next();
		
		String s1[]=str.split(" ");
		
		for(int i=0;i<s1.length;i++)
		{
			if(s1[i].equals(rep))
			{
				s1[i]=str1;
			}
			
		}
	
		System.out.println(Arrays.toString(s1));
			
sc.close();		
	}

}
