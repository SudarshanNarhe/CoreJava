package com.scannerdemo;
import java.util.Scanner;
public class ScannerDemo {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Your Name :");
		String name= sc.next();
		System.out.println("Enter your roll no.");
		int roll= sc.nextInt();
		System.out.println("Enter your Percentage");
		float prntg=sc.nextFloat();
		System.out.println("Enter your grade");
		char grade= sc.next().charAt(0);
		System.out.println("-----------------------------------------------------");
		System.out.println(name+ " with roll no "+roll+" has scored "+prntg+"% with grade "+grade);
		sc.close();
	}
	
}
