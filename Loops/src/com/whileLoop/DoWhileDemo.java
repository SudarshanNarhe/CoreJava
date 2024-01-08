package com.whileLoop;

import java.util.Scanner;

public class DoWhileDemo {

	public static void main(String[] args) {
	 Scanner sc = new Scanner (System.in);
	 int num =0;
	 int sum =0;
	 do 
	 {
		 System.out.println("Enter any number : ");
		  num=sc.nextInt();
		 sum+=num;
	 }while(num!=0);
	 System.out.println("The sum is : "+sum);
sc.close();
	}

}
