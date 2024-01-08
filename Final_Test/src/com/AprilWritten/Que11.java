package com.AprilWritten;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;


/*12)An map contains student object as a key and list of courses he has enrolled in. [1M]
e.g. map<student , list(course)>
Create another map in which course id is a key and list of student objects of that 
*/

public class Que11 {

	ArrayList<Course> al= new ArrayList<Course>();
	
	public static void main(String[] args) {

		Student s1 = new Student(1, "Yogesh", new Course(1, "phy"));
		Student s2 = new Student(1, "Yogesh", new Course(2, "Maths"));
		Student s3 = new Student(2, "Suraj", new Course(1, "phy"));
		Student s4 = new Student(3, "Kishor", new Course(1, "phy"));
		Student s5 = new Student(3, "Kishor", new Course(2, "Maths"));
		Student s6 = new Student(4, "Amol", new Course(1, "phy"));
		Student s7 = new Student(5, "Akash", new Course(1, "phy"));
		Student s8 = new Student(5, "Akash", new Course(2, "Maths"));

		Map<Student, List<Course>> studentCoursesMap = new HashMap<>();
		

		 for (Student student : Arrays.asList(s1, s2, s3, s4, s5, s6, s7, s8)) {
			if (!studentCoursesMap.containsKey(student)) {
				studentCoursesMap.put(student, new ArrayList<Course>());
			} 
				studentCoursesMap.get(student).add(student.getCourse());
		}

		for (Entry<Student, List<Course>> e : studentCoursesMap.entrySet()) {
			Student s = e.getKey();
			System.out.println(s);
			for (Course c : e.getValue()) {
				System.out.println("\t" + c);
			}
		}
		
		
		HashMap<Integer, ArrayList<Student>> courseStudentMap= new HashMap<>();
		
		for (Student student : Arrays.asList(s1, s2, s3, s4, s5, s6, s7, s8)) {
			Integer cid= student.getCourse().getCid();
			if (!courseStudentMap.containsKey(cid)) {
				courseStudentMap.put(cid, new ArrayList<Student>());
			} 
				courseStudentMap.get(cid).add(student);
		}
		
		System.out.println();
		System.out.println("courseStudentMap");
		for (Entry<Integer, ArrayList<Student>> e : courseStudentMap.entrySet()) {
			int cid = e.getKey();
			System.out.println("Course Id : " + cid);
			for (Student s : e.getValue()) {
				System.out.println("\t" + s);
			}
		}

	}
}

class Student {
	private int sid;
	private String name;
	Course course;

	public Student() {

	}

	public Student(int sid, String name, Course course) {
		super();
		this.sid = sid;
		this.name = name;
		this.course = course;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}

		Student student = (Student) obj;
		return sid == student.sid && Objects.equals(name, student.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(sid, name);
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", course=" + course + "]";
	}

}

class Course {
	private int cid;
	private String cName;

	public Course() {

	}

	public Course(int cid, String cName) {
		super();
		this.cid = cid;
		this.cName = cName;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cName=" + cName + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}

		Course course = (Course) obj;
		return cid == course.cid && Objects.equals(cName, course.cName);
	}

	@Override
	public int hashCode() {
		return Objects.hash(cid, cName);
	}

}

