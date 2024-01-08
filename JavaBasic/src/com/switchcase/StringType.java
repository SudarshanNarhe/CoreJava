package com.switchcase;

import java.util.Scanner;

public class StringType {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter a name of Month with first letter is capital : ");
		String mnt= sc.next();
		switch (mnt)
		{
		case "January" : 
		case "March" :
		case "May" :
		case "July" :
		case "August" :
		case "October" :
		case "December" :System.out.println("31 days");
		break;
		case "April" :
		case "June" :
		case "September" :
		case "November" :System.out.println("30 days");
		break;
		case "February" : System.out.println("28/29 days");
		break;
		default : System.out.println("Error... Please enter a correct input");

		}
		
sc.close();
	}

}
