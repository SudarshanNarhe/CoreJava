package com.switchcase;

import java.util.Scanner;

public class DemoSwitch {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a weekday number : ");
		int wno = sc.nextInt();
		
//		if (wno==1)
//			System.out.println("Monday");
//		else if (wno=2)
//			System.out.println("Tuesday");
//		...so on
		
		switch (wno)
		{
		case 1 : System.out.println("Monday");
		break;
		case 2 : System.out.println("Tuesday");
		break;
		case 3 : System.out.println("Wednesday");
		break;
		case 4 : System.out.println("Thursday");
		break;
		case 5 : System.out.println("Friday");
		break;
		case 6 : System.out.println("Saturday");
		break;
		case 7 : System.out.println("Sunday");
		break;
		default : System.out.println("Please enter a number from 1 to 7");
		}
		System.out.println("Enjoy your day...");
		sc.close();
	}

}
