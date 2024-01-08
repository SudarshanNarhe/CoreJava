package com.basic;

import java.util.Scanner;

public class GradeAndPercentage {

	
/*
	public static void show(double num[])
	{
		System.out.println("The marks are : ");
		for(double mark : num)
			System.out.println(mark);
	}
	public static double [] arrayCreation()
	{
		double num[];
		System.out.println("Enter a number of Subjects : ");
		Scanner sc = new Scanner(System.in);
		int sub = sc.nextInt();
		num= new double [sub];
		for (int i=0;i<num.length;i++)
		{
			System.out.println("Enter marks of "+(i+1)+ " Subject : ");
			num[i]=sc.nextDouble();
		}
		sc.close();
		return num;	
		
	}
	
	*/
	
	
	/* we pass the length  with the array so we can use the normal method also
	 * for that just change the formula as per =(sum*100)/(num.length*100)
	 * 
	 */
	
	
	public static void checkGrade_per()
	{
		double sum=0;
		double per;
		double num[];
		System.out.println("Enter a number of Subjects : ");
		Scanner sc = new Scanner(System.in);
		int sub = sc.nextInt();
		num= new double [sub];
		for (int i=0;i<num.length;i++)
		{
			System.out.println("Enter marks of "+(i+1)+ " Subject : ");
			num[i]=sc.nextDouble();
		}
		
		for(int i=0;i<num.length;i++)
		{
			sum=sum+num[i];
		}
		System.out.println("The marks are : ");
		for(double mark : num)
			System.out.println(mark);
		System.out.println("The sum of total numbers is : "+sum);
		per=(sum*100)/(sub*100); //per =(sum*100)/(num.length*100)
		System.out.println("The total Percentage is "+per);
		if(per>=80)
			System.out.println("Grade : A");
		else if(per>=60)
			System.out.println("Grade : B");
		else if(per>=40)
			System.out.println("Grade : c");
		else if(per>=35)
			System.out.println("Grade : D");
		else 
			System.out.println("Fail");
		
		sc.close();
	}
	
	public static void main(String[] args) {
		
		checkGrade_per();
	}

}
