package com.ifelse;

import java.util.Scanner;

public class BillElectricity {
///
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter a unit consumed : ");
		float unit = sc.nextFloat();
		double bill=100;
		if (unit<=50)
			bill+=(unit*2);//bill=bill+unit*2
		else if (unit <=80)
			bill+=(50*2)+(unit-50)*3;
		else if (unit<=100)
			bill+=(50*2)+(30*3)+(unit-80)*4;
		else 
			bill+=(50*2)+(30*3)+(20*4)+(unit-100)*7;
		System.out.println("The bill for "+unit+ "units is :"+bill);
	
		sc.close();
	}

	
}
