package com.AprilWritten;

/*13)Write a Java program to print the first 15 numbers of the series.[1M]
The first few terms of the sequence are :
0, 1, 2, 5, 12, 29, 70, 169, 408, 985, 2378, 5741, 13860,…
*/

public class Que12 {
	
	public static void main(String[] args) {
		
		int pre=0;
		int cur=1;
		int next=0;
		//int res= 2*res + prev;
		//next number=Current number×2+previous number
		System.out.print(pre+", "+cur+", ");
		for(int i=0;i<=15;i++) {
			next=cur*2+pre;
			System.out.print(next+", ");	
			pre= cur;
			cur=next;	
		}
		
		
	}

}
