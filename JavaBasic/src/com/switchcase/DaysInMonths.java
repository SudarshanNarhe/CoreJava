package com.switchcase;

import java.util.Scanner;

public class DaysInMonths {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a name of month : ");
		String mno= sc.next();
		switch(mno)
		{
		    case "January":
		    case "March":
		    case "May":
		    case "July":
		    case "August":
		    case "October":	
		    case "December": System.out.println("31 Days");
		    	break;
		    case "April":
		    case "June":
		    case "September":
		    case "November":System.out.println("30 days");
		    break;
		    case "february":System.out.println("28 days");
		    break;
		    default : System.out.println("Error in input.....");
		}
		sc.close();
	}

}
