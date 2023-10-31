package com.Logics2;

import java.util.Scanner;

public class KrishnamurthiNumber {
	
	static boolean checkKrishnamurthi(int n)
	{
		boolean status;
		int sum=0;
		int original=n;
		 while(n>0)          //run the loop till number is greater than zero.                        
	      {
	     	   int  rem=n%10;
	     	     int fact=1;
		        for (int j=1;j<=rem;j++)
		        {
		  		  fact=fact*j;	      
		         }
		        sum=sum+fact;
		        n/=10;	        
	      }
		      
		      if(sum==original)
			    status= true;
		        else 
		     	status= false;
		      
		return status;
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number : ");
		int num=sc.nextInt();
		
		if(checkKrishnamurthi(num))
			System.out.println("The number is a Krishnamurthi number.");
		else 
			System.out.println("The number is NOT a Krishnamurthi number.");
		
sc.close();
	}

}
