package com.ifelse;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter a 1st number");
	    float num1 = sc.nextFloat();
	    System.out.println("Enter a 2nd number");
	    float num2 = sc.nextFloat();
	    System.out.println("1.Addition");
	    System.out.println("2.Substraction");
	    System.out.println("3.Multiplication");
	    System.out.println("4.Division");
	    System.out.println("Enter your choice from above menu");
	    int choice = sc.nextInt();
	    if(choice==1)
	    {
	    	System.out.println("Addition = "+(num1+num2));
	    }
	    else if (choice==2)
	    {
	    	System.out.println("Substraction = "+(num1-num2));
	    }
	    else if (choice==3)
	    {
	    	System.out.println("Multiplication = "+(num1*num2));
	    }
	    else if (choice==4)
	    {
	    	System.out.println("Division = "+(num1/num2));
	    }
	    else
	    {
	    	System.out.println("Your choice is wrong");
	    }
	    sc.close();

	}

}
