package com.ArrayList;

import java.util.ArrayList;

//Create Arraylist of integers. Add first 50 odd numbers to arraylist.

public class OddNumbers {

	public static void main(String[] args) {
		
		ArrayList<Integer> obj=new ArrayList<Integer>();
		int count=1;
		int i=1;
		while(count<=50) {
		   obj.add(i);
		   count++;
		    i=i+2;
		}
		System.out.println(obj);
		
	}
	
}
