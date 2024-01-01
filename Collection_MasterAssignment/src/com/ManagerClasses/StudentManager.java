package com.ManagerClasses;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import com.BeanClasses.Academy;
import com.BeanClasses.Student;

public class StudentManager {

	public static void dummyAddStudents() {
		addStudent(1);
		addStudent(2);
		addStudent(3);
		
	}
	public static void addStudent(int courseID) {
			
		Student s1= new Student(101, "Sudarshan", 9375278372l, "sudarshan@mail");
		Student s2= new Student(102, "Pavan", 6453789235l, "pavan@mail");
		Student s3= new Student(103, "Suraj", 7854893465l, "suraj@mail");
		Student s4= new Student(104, "Yogesh", 2348769546l, "yogesh@mail");
		Student s5= new Student(105, "Snehal", 8743987245l, "snehal@mail");
		Student s6= new Student(106, "Utkarsha", 8746345290l, "utkarsha@mail");
		Student s7= new Student(107, "Suraj", 8465982030l, "suraj@mail");
		
		if(courseID==1) {
			ArrayList<Student> student1= new ArrayList<Student>();
			student1.add(s2);
			student1.add(s5);
			Academy.studentMap.put(1, student1);

		}
		else if(courseID==2) {
			ArrayList<Student> student2= new ArrayList<Student>();
			student2.add(s1);
			student2.add(s3);
			student2.add(s6);
			Academy.studentMap.put(2, student2);
			
		}
		else if(courseID==3) {
			ArrayList<Student> student3= new ArrayList<Student>();
			student3.add(s4);
			student3.add(s7);
			Academy.studentMap.put(3, student3);
			
		}
		else
			System.out.println("Invalid Input...");
		
					
	}
	public static void showStudent() {
		
		Iterator<Entry<Integer, List<Student>>> itr= Academy.studentMap.entrySet().iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
	//show most favoured course based on number of students enrolled. 
	//(Course with maximum students) 
	public static void maxStudentsInCourse() {
	
		Iterator<Entry<Integer, List<Student>>> set=Academy.studentMap.entrySet().iterator();
		int max=0;
		int key=0;
		while(set.hasNext()) {
			Entry<Integer, List<Student>> list=set.next();
			int size = list.getValue().size();
			if(max<size) {
				max=size;
				key=list.getKey();
			}	
		}
		CourseManager.findCourseByID(key, max);		
	}
	
	//Method to add all student names in one place and print all student names which are 
	//duplicate.
	
	public static void duplicateNames() {
		Iterator<Entry<Integer, List<Student>>> set =Academy.studentMap.entrySet().iterator();
		Set<String> uniqueValues = new HashSet<>();
		Set<String> duplicateValues = new HashSet<>();
		while(set.hasNext()) {
			Entry<Integer, List<Student>> list=set.next();
			Iterator<Student> std=list.getValue().iterator();
			while(std.hasNext()) {
				Student obj=std.next();
            String value = obj.getStudentName();
            if (!uniqueValues.add(value)) {
                duplicateValues.add(value);
			}
		}
	}
	System.out.println("\nUnique Names are: \n"+uniqueValues);
	System.out.println("\nDuplicate Names of students : ");
	System.out.println(duplicateValues);

}
	
	public static void allStudents() {
		Iterator<Entry<Integer, List<Student>>> set=Academy.studentMap.entrySet().iterator();
		while(set.hasNext()) {
			Entry<Integer, List<Student>> list=set.next();
			Iterator<Student> std=list.getValue().iterator();
			while(std.hasNext()) {
				Student obj=std.next();
				System.out.println(obj.getStudentName());
			}
		}
		
		duplicateNames();
		
	}
	
}
