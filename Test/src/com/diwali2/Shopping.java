package com.diwali2;

import java.util.Scanner;

/*Write a program with Shopping class which has overloaded method ‘doTransaction’. 
If it has CreditCard type parameter it should display message ‘You got 15% discount on bill on credit card transaction’.                                
If it has DebitCard type parameter it should display message ‘No discount on bill on debit card transaction’.                      
*/

public class Shopping {

	public static void doTransaction(String cr, int amt) {
		
		System.out.println("You got 15% discount on bill on credit card transaction");
	}
	public static void doTransaction(int amt, String dr) {
		
		System.out.println("No discount on bill on debit card transaction");
	}
	
	public static void main(String[] args) {
			
		System.out.println("Enter a Mode of Payment : ");
		Scanner sc = new Scanner (System.in);
		System.out.println("1.Credit Card \n2.Debit card ");
		int a = sc.nextInt();
		System.out.println("Enter Amount : ");
		int amt = sc.nextInt();
		String str = "cardDetails";
		if(a==1) {
			doTransaction(str, amt);
		}
		else {
			doTransaction(amt, str);
		}

		
sc.close();
	}

}