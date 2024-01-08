package com.ifelse;

import java.util.Scanner;

public class LadderDemo {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your percentage");
		float per= sc.nextFloat();
		char grade;
		if(per>=85)
		{ 
			grade='A';
		}
		    else if(per>=70)
		    {
		    	grade='B';
		    }
		          else if(per>=50)
		             {
		             	grade='C';
		             }
		    	       else if(per>=40)
		    	       {
		    		      grade='D';
		    	         }
		    	           else
		    	               {
		    		               grade ='F';
		                     	}
		   if(grade!='F')
		   {
			   System.out.println("You have clear the exam with "+grade);
		   }
		   else 
		   {
			   System.out.println("You are failed in the exam.");
		   }
		   sc.close();
	}

}
