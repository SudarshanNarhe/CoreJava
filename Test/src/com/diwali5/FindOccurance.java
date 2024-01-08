package com.diwali5;

import java.util.Scanner;

/*Find out number of occurances of a given character in a string. 
Also display index of last position of that character in given string. 
E.g. “nopainnogain”  given character – n.Output will be ,   n occurs 4 times. And 11 is last index of n. */

public class FindOccurance {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Any Name : ");
		String name= sc.next();
		
		char ch []= name.toCharArray();
		System.out.println("Enter a Character : ");
		char abc = sc.next().charAt(0);
		
		int count=0;
		int lastindex=0;
		for(int i=0;i<ch.length;i++) {
			
			if(ch[i]==abc) {
				count++;
				lastindex=i;
			}
		}
		if(count>0) {
		System.out.println(abc +" Occurs "+count+" times and "+lastindex+" is the last index of "+abc);
		}
		else 
			System.out.println("Given Character not found in given Name");
		
sc.close();
	}
	
	
}
