package com.ifelse;

import java.util.Scanner;

public class GrossSalary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your basic salary : ");
		int sal= sc.nextInt();
		int hra, da, grsal,per1,per2;
		
		if (sal<=10000)
		{
			hra=20;
			da=80;
//			 per1= sal/100*hra;
//			 per2= sal/100*da;
//			grsal= sal+per1+per2;
//			System.out.println("The gross salary is :"+grsal);
		}
		else if (sal<=20000)
		{
			hra=25;
			da=90;
//			 per1= sal/100*hra;
//			 per2= sal/100*da;
//			grsal= sal+per1+per2;
//			System.out.println("The gross salary is : "+grsal);
		}
		else
		{
			hra=30;
			da=95;
//			 per1= sal/100*hra;
//			 per2= sal/100*da;
//			grsal= sal+per1+per2;
//			System.out.println("The gross salary is : "+grsal);
		}
		 per1= sal/100*hra;
		 per2= sal/100*da;
		grsal= sal+per1+per2;
		System.out.println("The gross salary is : "+grsal);
		sc.close();

	}

}
