package com.ifelse;

import java.util.Scanner;

public class CharacterCheck {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Character :");
		char ch = sc.next().charAt(0);
		if((ch>=48)&&(ch<=57))
		{
			System.out.println("Its a number");
		}
		else if((ch>=65)&&(ch<=90))
		{
			System.out.println("Its a capital letter.");
		}
		else if((ch>=97)&&(ch<=122))
		{
			System.out.println("Its a small letters");
		}
		
		else 
		{
			System.out.print("Its a special character");
		}
        sc.close();
	}

}
