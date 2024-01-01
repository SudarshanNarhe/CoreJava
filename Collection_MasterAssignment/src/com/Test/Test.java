package com.Test;

import java.util.Scanner;

import com.ManagerClasses.AllManager;
import com.ManagerClasses.AttendanceManager;
import com.ManagerClasses.CourseManager;
import com.ManagerClasses.StudentManager;
import com.ManagerClasses.TestResultManager;
import com.ManagerClasses.TransactionManager;

public class Test {

	public static void main(String[] args) {
		
		//Show All Courses...
		System.out.println("Course : ");
		CourseManager.addCourse();
		CourseManager.showCourse();
		System.out.println("-----------------------------------------------------------------------------");
		
		//Show All Students...
		System.out.println("Students : ");
		StudentManager.dummyAddStudents();
		StudentManager.showStudent();
		
		System.out.println("-----------------------------------------------------------------------------");
		
		//Show All Attendance Information...
		System.out.println("Attendance : ");
		AttendanceManager.dummyAddforAttendance();
		AttendanceManager.showAttendance();
		
		System.out.println("-----------------------------------------------------------------------------");
		
		//Show All Transaction details...
		System.out.println("Transaction : ");
		TransactionManager.dummyAddforTransaction();
		TransactionManager.showTransaction();
		
		System.out.println("-----------------------------------------------------------------------------");
		
		//Show All Test Results...
		System.out.println("Test Results : ");
		TestResultManager.addDummyforTestResult();
		TestResultManager.showTestResult();
		
		System.out.println("-----------------------------------------------------------------------------");
		
		//show most favoured course based on number of students enrolled.(Course with maximum students) 
		System.out.println("Most favoured Course are : ");
		StudentManager.maxStudentsInCourse();
		
		System.out.println("-----------------------------------------------------------------------------");
		
		System.out.println("Students who Paid All fees are : ");
		TransactionManager.paidAllFees();
		
		System.out.println("----------------------------------------------------------------------------------------------------------------");

		System.out.println("Following Students Having poor Performance : ");
		TestResultManager.countPercentageForPoorPerformance();
		
		System.out.println("---------------------------------------------------------------------------------------------------------------------");

		System.out.println("Compare Students : \n");
		TestResultManager.comaparing();
		
		System.out.println("-----------------------------------------------------------------------------");
		
		//One method which takes course id as input and shows all students registered for this 
		//course.
		
				Scanner sc = new Scanner(System.in);
//				System.out.println("Enter a Course Id : ");
//				int id = sc.nextInt();
//				System.out.println("Students with Course ID "+id+" is : ");
//				StudentManager.addStudent(id);
//				StudentManager.showStudent();
//				
		
		System.out.println("-----------------------------------------------------------------------------------------------------------------");
		
		System.out.println("Show Table for Revenue  \n");
		AllManager.showTableRevenue();
		
		System.out.println("-----------------------------------------------------------------------------------------------------------------");
		
		System.out.println("All Students Names ");
		StudentManager.allStudents();
		
		
sc.close();
	}

}
