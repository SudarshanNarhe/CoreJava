package com.ifelse;

import java.util.Scanner;

public class DaysinMonths {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int month=12;
		System.out.println("Enter a number of month");
		int month = sc.nextInt();
		//int m1=1,m2=2,m3=3,m4=4,m5=5,m6=6,m7=7,m8=8,m9=9,m10=10,m11=11,m12=12;
		if ((month==1)||(month==3)||(month==5)||(month==7)||(month==8)||(month==10)||(month==12))
		{
			System.out.println("The month having a 31 days.");
		}
		else if ((month==4)||(month==6)||(month==9)||(month==11))
		{
			System.out.println("The month having a 30 days.");
		}
		else if (month==2)
		{
			System.out.println("The month having a 28/29 days.");
		}
		else 
			System.out.println("You have add a wrong input please add from 1 to 12");
		sc.close();
	}

}
