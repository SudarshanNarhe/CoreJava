package com.Logics2;

import java.util.Scanner;

public class FrequencyOfDigit {

	static void checkFrequency(int n)
	{
		
		int rem;
		do
		{
			rem=n%10;
			int a=rem;
			int b=rem;
			int c=rem;
			int d=rem;
			int e=rem;
			n/=10;
			if (a==b)
				a++;
				else if(a==c) 
					a++;
					else if(a==d) 
						a++;
						else if (a==e)
			{              a++;
				System.out.println("The frequency of "+a+" is: "+a);
			}
			else if(b==c)
					b++;
					else if(b==d)
						b++;
						else if(b==e)
			{					b++;
				System.out.println("The frequency of "+b+" is: "+b);
			}
			else if(c==d)
				c++;
				else if(c==e)
			{			c++;
				System.out.println("The frequency of "+c+" is: "+c);
			}
			else
				System.out.println("The integer doesn't have any frequency digit.");
			
			
		}while(n!=0);
		
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any integer : ");
		int num=sc.nextInt();
		checkFrequency(num);
		
	sc.close();	
	}

}
