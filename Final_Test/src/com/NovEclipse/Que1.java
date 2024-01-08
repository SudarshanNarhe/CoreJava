package com.NovEclipse;

import java.util.Scanner;

/*Q1.Find how many 2000, 500, 100, 50 notes will be required to make specified amount. 
 * Amount should be multiple of 50. E.g. To make amount 2,550 it required 1 note of 2000, 
 * one note of 500 and 1 of rupees 50.	[1] */

public class Que1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a amount : ");
		int amount=sc.nextInt();
		if(amount%50==0) {
			int count1 = 0;
			int count2 = 0;
			int count3 = 0;
			int count4 = 0;
			while (amount > 0) {
				if (amount >= 2000) {
					count1++;
					amount = amount - 2000;
				}

				else if (amount >= 500) {
					count2++;
					amount = amount - 500;
				} else if (amount >= 100) {
					count3++;
					amount = amount - 100;
				} else if (amount >= 50) {
					count4++;
					amount = amount - 50;
				}
			}
			if(count1>0)
			System.out.println(count1 + " note of 2000");
			if(count2>0)
			System.out.println(count2 + " note of 500");
			if(count3>0)
			System.out.println(count3 + " note of 100");
			if(count4>0)
			System.out.println(count4 + " note of 50");
		}
		else
			System.out.println("Please Enter a amount in multiple of 50");
		
sc.close();
   }
	
}
