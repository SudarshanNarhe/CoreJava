package com.switchcase;
import java.util.Scanner;
public class DaysinMon2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number of month : ");
		int num = sc.nextInt();
		
		switch(num)
		{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:System.out.println("31 days");
		break;
		case 4:
		case 6:
		case 9:
		case 11:System.out.println("30 days");
		break;
		case 2: System.out.println("Enter a year : ");
		         int yr=sc.nextInt();
		         if ((yr%4==0)&&(yr%100!=0)||(yr%400==0))
		        	 System.out.println("29 days");
		         else
			       System.out.println("28 days");
		break;
		default :System.out.println("Incorrect input please input from 1 to 12.");
		}
		System.out.println("Have a nice day...!!!");
		
		sc.close();
	}

}
