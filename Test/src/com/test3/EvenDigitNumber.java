package com.test3;

public class EvenDigitNumber {

	public static boolean checkEvenDigitNumber(int num)
	{
			
			while (num > 0)
		 	{
	           int  digit = num % 10;
	           
	            if (digit % 2 != 0) 
	            {
	                return false;
	            }
	            num /= 10;
	        }
	       return true;
		
	}
	
	public static void main(String[] args) {

		for(int i=100;i<=400;i++)
		{
			if(checkEvenDigitNumber(i))
			{
				System.out.println(i);
			}
			
		}

	}

}
