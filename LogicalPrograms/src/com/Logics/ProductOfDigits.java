package com.Logics;

import java.util.Scanner;

public class ProductOfDigits {
 static int prod(int n)
 {
	 int rem;
	 int prod=1;
	 do 
	 {
		 rem=n%10;
		 n=n/10;   //n/=10;
		 prod=prod*rem;
		 System.out.println(+rem);
	 }while(n!=0);
	 
	return prod; 
 }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter any number : ");
	    int num =sc.nextInt();
	   // int prod1=prod(num);
	   // System.out.println("The Product of digits is : "+prod1);
	    System.out.println("The Product of digit is : "+prod(num));
sc.close();
	}

}
