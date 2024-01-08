package com.test2;

import java.util.Scanner;

public class TechNo {
	
	int num;
	int original;
	int lastpart, sum, power=1;
	boolean tech;
	
	TechNo()
	{
		num=0;
		original=num;
	}
	TechNo(int num)
	{
		this.num=num;
		original=num;
	}
	public int calSum()
	{
		int count=0;
		while(num>0)
		{
			num=num/10;
			count++;
		}
		for(int i=1;i<=count/2;i++)
		{
			power=power*10;
		}
		if(count%2==0)
		{
			num = original/power;
			lastpart= original%power;
			sum=num+lastpart;
			this.checkTechNo();
			this.displayTechNo();
		}
		else
		{
			System.out.println("Invalid number of digits...");
		}
		return sum;
	}
	public boolean checkTechNo()
	{
		if(original==(sum*sum))
			return tech=true;
		else 
			return tech = false;
	}
	public void displayTechNo()
	{
		if(tech==true)
		{
			System.out.println(original+ " is a Tech Number.");
		}
		else
			System.out.println(original+" is not a Tech Number.");
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an number : ");
		int num = sc.nextInt();
		TechNo obj = new TechNo(num);
		obj.calSum();
sc.close();
		
	}

}
