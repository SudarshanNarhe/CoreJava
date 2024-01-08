package com.switchcase;

import java.util.Scanner;

public class WeekdayAndWeekend {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a name of day with a capital letter : ");
		String name=sc.next();
		switch(name)
		{
		case "Monday" :
		case "Tuesday" :
		case "Wednesday" :
		case "Thursday" :
		case "Friday" :System.out.println(name+" is a weekday");
		break;
		case "Saturday" :
		case "Sunday" : System.out.println(name+" is a weekend.");
		break;
		default : System.out.println("Error.....incorrect input.");
		}
		System.out.println("Enjoy..!! Your day.");
sc.close();
	}

}
