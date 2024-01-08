package com.AprilWritten;

import java.util.Scanner;

/*25) Find out if given number is pronic or not.[1M]
Input 72=8*9 ,20=4*5 72 is pronic number because 8 and 9 are consecutive no.
*/

public class Que25 {
	
	public static void checkPronic(int num) {
		int res=0;
		int count=0;
		for(int i=0;i<=num/2;i++) {
			res=i*(i+1);
			if(res==num) {
				System.out.println("Its a Pronic");
				count++;
			}	
		}
		if(count==0) {
			System.out.println("Not Pronic");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number : ");
		int num=sc.nextInt();
		checkPronic(num);
sc.close();		
	}
	
}
