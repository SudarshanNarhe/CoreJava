package com.basic;

import java.util.Arrays;

//Check whether String is Anagram.

public class Anagram {

	public static char[] sortArray(char num[])
	{	
		
		char temp=' ';
		for(int i=0;i<num.length-1;i++)
		{
			for(int j=0;j<num.length-i-1;j++)
			{
				if(num[j]>num[j+1])
				{
					temp=num[j];
					num[j]=num[j+1];
					num[j+1]=temp;
				}
			}
		}
		return num;
	}
	
	public static void main(String[] args) {
		
		String str = "care";
		String str1= "race";
		
		System.out.println(str);
		System.out.println(str1);
		
		//Convert String to Array 
		char ch[]=str.toCharArray();
		char []ch1 =str1.toCharArray();
		
		 //Pass the array for sorting
		sortArray(ch);
		sortArray(ch1);
		System.out.println(Arrays.toString(ch1));
		System.out.println(Arrays.toString(ch));
		
		// Convert a array to String  
		String str3= new String(ch);  
		String str4= new String(ch1); 
		System.out.println(str3);
		System.out.println(str4);
		
		//Compare two Strings
		if(str3.equals(str4))
		{
			System.out.println("Its a Anagram");
		}
		else
			System.out.println("Its Not a Anagram");
			
	}
	

}
