package com.Logics2;

import java.util.Scanner;

public class CheckDigitPrime2 {

	static void checkPrime(int n)
	{
		boolean status= true; //assume
	          int rem;
	    for(int i=1;i<=n;i++)
	      {
	     	     rem=n%10;
	     	     if((rem==0)||(rem==1))
	     	    	 status = false;
		          for(int j=2;j<rem;j++)
		         {
		         	if(rem%j==0)
		         	{     
		         		status = false;
			          	break;
			         }
		}   
		 if(status)    //--->>true 
		System.out.println(rem);
		n=n/10;

	}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number : ");
		int num=sc.nextInt();
		checkPrime(num);
		
sc.close();
	}

}
