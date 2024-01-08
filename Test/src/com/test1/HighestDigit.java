package com.test1;

import java.util.Scanner;

public class HighestDigit {

	int num;
	public void checkHighDigit(int num)
	{
		this.num=num;
		int rem;
		int digit=0;
		do
		{
			rem=num%10;
			if(digit<rem)
			{
				digit=rem;
			}
			num/=10;
		}while(num!=0);
		System.out.println("The highest among Digit is : "+digit);
	}
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter any number : ");
		int num=sc.nextInt();
		
		HighestDigit obj=new HighestDigit();
		obj.checkHighDigit(num);
		
sc.close();		
	}

}
