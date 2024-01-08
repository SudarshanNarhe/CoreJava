package com.ifelse;
import java.util.Scanner;
public class PercentagesOfStudents {

	public static void main(String[] args) {
//		A student will not be allowed to sit in exam if his/her attendence is less than 75%.
//		Take following input from user
//		Number of classes held
//		Number of classes attended.
//		And print
//		percentage of class attended
//		Is student is allowed to sit in exam or not.

		Scanner sc= new Scanner (System.in);
		System.out.println("Enter a number of classes held : ");
		int class_held = sc.nextInt();
		System.out.println("Enter a number of classes attended : ");
		int class_attend=sc.nextInt();
		double perntg = (class_attend*100/class_held);
		//int perntg= (class_attend*100/class_held);
		System.out.println("Your attendance is "+perntg+" %");
		if (perntg>=75)
			System.out.println("Yor are allowed to sit in the examination,");
		else 
			System.out.println("Your attendance is less thaan 75% you are not allowed t sit in the examination");
				
sc.close();
	}

}
