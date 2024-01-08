package com.test4;

import java.util.Scanner;

/*Special words are those words which starts and ends with the same letter.
Examples: EXISTENCE, COMIC, WINDOW.
Palindrome words are those words which read the same from left to right and vice-versa. 
Examples: MALAYALAM, MADAM, LEVEL, ROTATOR, CIVIC. 
All palindromes are special words, but all special words are not palindromes.
Write a program to accept a word, check and print whether the word is a palindrome or only special.*/

public class PalinromeAndSpecialWords {

	public static boolean checkPalindrome(String word) {
		boolean status;
		String str="";
		char[] ch=word.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
			str+=word.charAt(i);
		}
		if(str.equals(word)) {
			status=true;
		}
		else
			status=false;
		
		return status;
		
	}
	public static boolean checkSpecial(String word) {
		boolean status=false;
		if(checkPalindrome(word)) {
			status=true;
		}
		else {
			char []ch=word.toCharArray();
			for(int i=0;i<ch.length;i++) {
				for(int j=ch.length-1;j>=0;j--) {
					if(ch[i]==ch[j]) {
						status=true;
					}
				}
			}
		}
		
		return status;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Word : ");
		String str =sc.next();
		if(checkPalindrome(str)) {
			System.out.println("Its a Palindrome");
		}
		else
			System.out.println("Its NOT a Palindrome");
		if(checkSpecial(str))
			System.out.println("Its a Special Character");
		else
			System.out.println("Its NOT a Special Character");
		
sc.close();		
	}
}
