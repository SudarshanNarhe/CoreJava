package com.exception;

import java.util.Scanner;

/* WAP which throws ArrayIndexOutBoundsException. 
 In the console, observe the stack trace and the 
line number from where the Exception is thrown  

WAP to use catch / handle the ArrayIndexOutOfBoundsException exception.*/

public class Observation {

	public void show(int arr[]) {
		
		for(int i=0;i<=arr.length;i++) {
			
			System.out.println(arr[i]);
		}
	}
	public void changeArray(int in, int num[]) throws ArrayIndexOutOfBoundsException{
		
		System.out.println(num[in]);
	}
	
	public static void main(String[] args) {
		System.out.println("Main Starts ");
		int a[]= {1,2,3,4,5};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the position You have to change : ");
		int index=sc.nextInt();
		
		Observation o = new Observation();
		try {
		o.changeArray(index, a);
		}catch (ArrayIndexOutOfBoundsException e) {
			
			e.printStackTrace();
		}
		System.out.println("Main Ends...");
		
sc.close();
	}
	
}
