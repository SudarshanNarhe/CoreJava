package com.diwali1;

import java.util.Scanner;

//Display message “you entered 1” on pressing key 1, 
//“you entered 2” on pressing key 2 etc from keyboard on entering digits 0-9. 
//Otherwise, program should display “Invalid Input!” .


public class Que13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		 int num=sc.nextInt();
		
		 switch(num) {
		 case 0: System.out.println("You Entered 0"); break;
		 case 1: System.out.println("You Entered 1"); break;
		 case 2: System.out.println("You Entered 2"); break;
		 case 3: System.out.println("You Entered 3"); break;
		 case 4: System.out.println("You Entered 4"); break;
		 case 5: System.out.println("You Entered 5"); break;
		 case 6: System.out.println("You Entered 6"); break;
		 case 7: System.out.println("You Entered 7"); break;
		 case 8: System.out.println("You Entered 8"); break;
		 case 9: System.out.println("You Entered 9"); break;
		 default : System.out.println("Invalid Input..!!");
		 }
		 
sc.close();
	}

}
