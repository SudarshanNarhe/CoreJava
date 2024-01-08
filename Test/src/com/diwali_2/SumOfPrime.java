package com.diwali_2;

import java.util.Scanner;

public class SumOfPrime {

	public static boolean checkPrime(int n) {
		
		boolean status=true;
			if(n==0 ||  n==1) {
				status=false;
			}
			else
				for(int j=2;j<n;j++) {
					if(n%j==0) {
						status=false;
						break;
					}
				}
		return status;
	}
	public static void sum(int n) {
		int sum=0;
		int count=0;
		
		for(int i=2;count<n;i++) {
			if(checkPrime(i)) {
				System.out.println(i);
				sum=sum+i;
				count++;
			}
		}
		System.out.println("Sum is : "+sum);
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a Number : ");
		int n= sc.nextInt();
		 
		sum(n);
		
sc.close();		
	}
	
}
