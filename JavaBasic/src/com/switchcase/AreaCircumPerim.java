package com.switchcase;

import java.util.Scanner;

public class AreaCircumPerim {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Area of a circle ");
		System.out.println("2. Area of a Square ");
		System.out.println("3. Area of a right angled triangle");
		System.out.println("4. Area of  rectangle");
		System.out.println("5. Circumference of a Circle");
		System.out.println("6. Perimeter of a Square ");
		System.out.println("Choice from above mentioned menu and enter a number from 1 to 6");
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1 : System.out.println("Enter a radius of a circle : ");
		          int r = sc.nextInt();
		          double area =  3.14*r *r;
		          System.out.println("The area of a circle is : "+area);
		          break;
		case 2 : System.out.println("Enter a side of a square : ");
		         int side = sc.nextInt();
		         double area1 = side*side;
		         System.out.println("The area of a Square :"+area1);
		         break;
		case 3 : System.out.println("Enter a base of a right angled triangle :");
		         int base = sc.nextInt();
		         System.out.println("Enter a height of a right angled triangle :");
		         int hei= sc.nextInt();
		         double area3 = 0.5*base*hei;
		         System.out.println("The Area of a right angled triangle is : "+area3);
		         break;
		case 4 : System.out.println("Enter a lenght of a rectangle : ");
               	int ln= sc.nextInt();
		          System.out.println("Enter a breadth of a rectangle : ");
		          int br=sc.nextInt();
		          double area4 = ln*br;
		          System.out.println("The area of a rectangle is : "+area4);
		          break;
		case 5 : System.out.println("Enter a Radius of a circle");
		         int r1 =sc.nextInt();
		         double circum= 2*3.14*r1;
		         System.out.println("The circumference of a circle is "+circum);
		         break;
		case 6 : System.out.println("Enter a side of a Square");
		         int sd=sc.nextInt();
		         double perim=4*sd; //perim=(sd+sd+sd+sd)
		         System.out.println("The perimeter of a square is : "+perim);
		          break;
		default : System.out.println("Please enter a correct input from 1 to 6");
		}
		
		
	
sc.close();
	}

	}


