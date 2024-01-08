package com.switchcase;

import java.util.Scanner;

public class NestedSwitch {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your couse name :");
		String course = sc.next();
		System.out.println("Enter your sem number : ");
		int sem = sc.nextInt();
		switch (course)
		{
		case "CSE" : 
			switch (sem)
			{
			case 1 : System.out.println("C, C++, Algoritham");
			break;
			case 2 : System.out.println("Java, DBMS, Math");
			break;
			default : System.out.println("Incorrect sem...");
			}
			break;
		case "ME" :
			switch (sem)
			{
			case 1 : System.out.println("ED, Microprocessor, Algoritham");
			break;
			case 2 : System.out.println("Thermodynamics, Automotive");
			break;
			default : System.out.println("Incorrect sem...");
			}
			break;
		default : System.out.println("Incorrect Course...");	
		}
		sc.close();
	}

}
