package com.switchcase;

import java.util.Scanner;

public class CheckVowelsCon {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any letter : ");
		//String ch= sc.next();
		char ch = sc.next().charAt(0);
		switch(ch)
		{
		case 'a':       // for String use all letters in double coat "a" 
		case 'A':
		case 'e':
		case 'E':
		case 'o':
		case 'O':
		case 'i':
		case 'I':
		case 'u':
		case 'U':System.out.println("Its a Vowel");
		break;
		default : System.out.println("Its a Consonant");
		}
		
		
		sc.close();
	}

}
