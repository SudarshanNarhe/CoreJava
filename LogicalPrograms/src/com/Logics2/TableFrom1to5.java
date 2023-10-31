package com.Logics2;

public class TableFrom1to5 {

	static void table(int n)
	{
		int num=n;
	  for(int i=1;i<=10;i++)  
		{
          System.out.println((num*i));
		}	 
	}
	
	public static void main(String[] args) {
		
		 for(int i=1;i<=5;i++)
		 {
			 table(i);
		 }
         
	}

}
