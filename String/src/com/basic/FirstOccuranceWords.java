package com.basic;

import java.util.Scanner;

//Write a Java program to find first occurrence of a word in a given string.
//Write a Java program to search all occurrences of a character in given string.

public class FirstOccuranceWords {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String str = "Aadarsh is a boy.He is a good boy";
		System.out.println(str);
		System.out.println("Enter a word you have to required first Occurance : ");
		String word = sc.next();
		for(int i=0;i<str.length();i++) {
		int j;
		String temp="";
			for(j=i;j<str.length() && str.charAt(j)!=32;j++)
			{
				temp+=str.charAt(j);
			}
			if(temp.equals(word))
			{
				System.out.println("The Index of a word is : "+(j-temp.length()));
				break;
			}
		}
		
sc.close();
	}

}
