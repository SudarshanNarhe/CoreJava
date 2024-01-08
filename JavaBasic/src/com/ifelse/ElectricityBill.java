package com.ifelse;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the electricity unit consumption :");
		float unit= sc.nextFloat();
		float bill1,bill2,bill3,bill4,r,charges,finalbill;
		//charges=unit/100*20;
		if (unit<=50)
		{
			r=0.50f;
			bill1=unit*r;
			charges=bill1/100*20;
			finalbill=bill1+charges;
			System.out.println("The bill of electricity is :"+finalbill);
		}
		else if (unit<=150)
		{
			r=0.75f;
			bill2=50*0.50f+(unit-50)*r;
			charges=bill2/100*20;
			finalbill=bill2+charges;
			System.out.println("The bill of electrcity is :"+finalbill);
		}
		else if (unit<=250)
		{
			r=1.20f;
			bill3=50*0.50f+100*0.75f+(unit-150)*r;
			charges=bill3/100*20;
			finalbill=bill3+charges;
			System.out.println("The bill of electricity is : "+finalbill);
		}
		else 
		{
			r=1.50f;
			bill4=50f*0.50f+100f*0.75f+100*1.20f+(unit-250)*r;
			charges=bill4/100*20;
			finalbill=bill4+charges;
			System.out.println("The bill of electricity is : "+finalbill);
		}
		
		sc.close();
	}

}
