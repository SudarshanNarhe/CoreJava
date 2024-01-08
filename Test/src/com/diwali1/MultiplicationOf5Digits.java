package com.diwali1;

//Display multiplication of first 5 digits between 300 to 600  (including both) ,
//which are multiples of 3 and 5.	


public class MultiplicationOf5Digits {

	
	public static void main(String[] args) {
		
		long multiplication=1;
		int count=0;
		int num=300;
		while(count<5) {
			if(num%3==0 && num%5==0)
			{
				 multiplication*=num;
				 count++;
			
			}
			num++;
		}
		System.out.println("The Multiplication is : "+multiplication);
	}
		
}
