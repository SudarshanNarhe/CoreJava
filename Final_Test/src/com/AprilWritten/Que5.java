package com.AprilWritten;

import java.util.Scanner;

/*5) You are given an interface AdvancedArithmetic which contains a 
 	method signature int divisor_sum(int n). 
    You need to write a class called MyCalculator which implements the interface.
divisor_Sum function just takes an integer as input and return the sum of all its divisors. 
For example divisors of 6 are 1, 2, 3 and 6, so divisor_sum should return 12*/

public class Que5 implements AdvanceArthmetic{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number : ");
		int num= sc.nextInt();
		int sum=AdvanceArthmetic.divisor_sum(num);
		System.out.println("Sum of divisors are : "+sum);
		
		
sc.close();		
	}
	
}

interface AdvanceArthmetic {
	
	static int divisor_sum(int n){
		int sum=0;
		
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}
		
		return sum;
	}
	
}
