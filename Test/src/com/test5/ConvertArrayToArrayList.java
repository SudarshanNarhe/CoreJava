package com.test5;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayToArrayList {

	public static void main(String[] args) {
		
		System.out.println("From Array to ArrayList ");
		Integer []a= {53,35,67,12,98,67,23};
		ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(a));
		System.out.println(arr);	
		
		System.out.println("From ArrayList to Array ");
		int []b= new int [arr.size()];
		for(int i=0;i<arr.size();i++) {
			b[i]=arr.get(i);
		}
		System.out.println(Arrays.toString(b));
		
		
		System.out.println("By Method ");
		 Integer[] arr5 = arr.toArray(new Integer[0]);
		 
		 System.out.println(Arrays.toString(arr5));
    
		
	}

}
