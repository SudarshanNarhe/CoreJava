package com.ManagerClasses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

import com.BeanClasses.Academy;
import com.BeanClasses.Course;
import com.BeanClasses.Date;

public class CourseManager {

	static List<Course> courseList=new ArrayList<Course>();
	
	public static void addCourse() {
		
		Course c1= new Course(1, "Developer", new Date(26, 9, 2023), "Java", 120000, "10 Months");
		Course c2= new Course(2,"Analyst",new Date(7,8,2023),"Python",110000,"8 Months");
		Course c3= new Course(3, "Testing", new Date(12, 10, 2023), "SQL and C#", 130000, "9 Months");
		
		Academy.courseList.add(c1);
		Academy.courseList.add(c2);
		Academy.courseList.add(c3);

	}
	public static void showCourse() {
		
		Iterator<Course> itr= Academy.courseList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
	public static void findCourseByID(int id, int max) {
		
		Iterator<Course> itr =Academy.courseList.iterator();
		while(itr.hasNext()) {
			
			Course obj= itr.next();
			if(obj.getCourseid()==id) {
				System.out.println(obj.getCourseName()+" has : "+max+" Students");
			}
		}
	}
	
	//Method to use TreeSet<Course> to store course details on fees from highest to lowest fees 
	//and printing the treemap output with course details
	
	public static void courseDetailsOnfees() {
		
	Iterator<Course> itr=Academy.courseList.iterator();
	TreeSet<Course> treeset = new TreeSet<Course>();
	while(itr.hasNext()) {
		Course obj=itr.next();
		treeset.add(obj);
		
	}
	//Collections.sort(treeset);
	}
	
}
