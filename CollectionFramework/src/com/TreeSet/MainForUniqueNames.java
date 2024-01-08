package com.TreeSet;

import java.util.Scanner;

/*WAP to create  Unique Names Tracker
The program should allow users to perform the following operations:

Add a Name: Add a new name to the set of unique names.

Remove a Name: Remove a specified name from the set.

Check if Name Exists: Check if a given name exists in the set.

Display All Names: Display all the unique names in the set.*/

public class MainForUniqueNames {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		UniqueNamesTracker obj = new UniqueNamesTracker();
		System.out.println("1.Add a Name \n2.Remove a Name \n3.Check \n4.Show Unique Names");
		int num=sc.nextInt();
		switch(num) {
		case 1: System.out.println("Enter a Name for Add : ");
				String str = sc.next();
				obj.addName(str);
				System.out.println("----------------------------------------");
				break;
		case 2: System.out.println("Enter a Name for Remove : ");
				String str1 = sc.next();
				obj.removeName(str1);
				System.out.println("----------------------------------------");
				break;
		case 3: System.out.println("Enter name for Check : ");
				String str2=sc.next();
				obj.checkName(str2);
				System.out.println("----------------------------------------");
				break;
		case 4: System.out.println("Unique Elements are : ");
				obj.show();
				break;
		default  : System.out.println("Invalid Input...");
		}
		
		
sc.close();	
	}
}
