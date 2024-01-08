package com.diwali5;

import java.util.Arrays;

/*Write a program to sort array of string in descening order of string length. 
If two strings have same legth sort them in ascending order of alphabets.
e.g.  String[] sarr = { “hi” , “how” , “are” , “you” , “doing” }
output will be { “doing” , “are” , “how” , “you” , “hi” }*/


public class Sorting {

	public static void main(String[] args) {
		
		String []sarr={"hi" , "how" , "are" , "you" , "doing" };
		
		System.out.println("Original : "+Arrays.toString(sarr));
		
		String temp="";
		
		for(int i=0;i<sarr.length;i++) {
			
			for(int j=i+1;j<sarr.length;j++) {
				
				if(sarr[i].length()<sarr[j].length()) {
					
					temp=sarr[j];
					sarr[j]=sarr[i];
					sarr[i]=temp;
				}
			}
		}
		System.out.println("Sorted String : "+Arrays.toString(sarr));
	}
	
}
