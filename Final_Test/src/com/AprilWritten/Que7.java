package com.AprilWritten;

/*7)  You are given a class Solution and its main method in the editor. 
Your task is to create the class Add and the required methods so that the code 
prints the sum of the numbers passed to the function add.[1M]
sample input
2,3
output 5
14,2,1
output 17
14,14,1,1
output 30
*/

public class Que7 {
	
	public static void main(String[] args) {
		
		int sum=Add.sum(10,20,30,40);
		System.out.println("Sum is : "+sum);
	}
	
}

class Add{
	
	public static int sum(int...num ) {
		
		int sum=0;
		for(int i=0;i<=num.length-1;i++) {
			sum=sum+num[i];
		}
		return sum;
		
	}
}
