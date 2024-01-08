package com.test4;

import java.util.Arrays;

/*Given sentence and a word, find if the word can be formed from given characters in sentence.
For example, 
s1=”THE SKY IS THE LIMIT”
word = "AXE", -> No 
word = "SIT", -> Yes can be formed
word = "AMIT", -> No*/

public class Que6Word {
	
	public static boolean checkWordForm(String str, String str1) {
		boolean status;
		char []ch = str.toCharArray();
		System.out.println(Arrays.toString(ch));
		char []ch1= str1.toCharArray();
		System.out.println(Arrays.toString(ch1));

		int count=0;
		for(int i=0;i<ch1.length;i++) {
			for(int j=0;j<ch.length;j++) {
				if(ch1[i]==ch[j]) {
					count++;
					break;
				}
			}
		}
		System.out.println(count);
		if(count==ch1.length) {
			
			status=true;
		}
		else
			status=false;
		return status;
	}
	
	public static void main(String[] args) {

		String str3="THE SKY IS THE LIMIT";
		String str4="AMIT";
		if(checkWordForm(str3, str4)) {
			System.out.println("The word is form.");
		}
		else
		{
			System.out.println("The word is NOT form");
		}
		
		
	
	}

}
