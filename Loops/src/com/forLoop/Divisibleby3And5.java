package com.forLoop;

public class Divisibleby3And5 {

	public static void main(String[] args) {
	
	   for (int i=1;i<=50;i++)
	   {
		    if ((i%3==0)&&(i%5==0))
		   {
			   System.out.println("Bye");
		   }
			 else if (i%3==0)
		   {
			   System.out.println("Hello");
		   }
		   else if(i%5==0)
		   {
			   System.out.println("Welcome");
		   }
		   
		   else
			   System.out.println(i);
	   }

	}

}
