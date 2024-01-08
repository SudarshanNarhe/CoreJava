package com.basic;

//Check whether String is palindrome

public class Palindrome {

	public static void main(String[] args) {
		
		String str = "nitin";
		String str1="";
//		StringBuffer str2= new StringBuffer(str);
//		System.out.println(str2.reverse());
		
		char []ch = str.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			str1+=str.charAt(i); ///str1= str1+str.charAt(i);
		}
		
		System.out.println(str1);
		
		if(str.equals(str1))
		{
			System.out.println("Its a Palindrome");
		}
		else 
			System.out.println("Its not a Palindrome");

	}

}
