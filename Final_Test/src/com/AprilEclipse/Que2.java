package com.AprilEclipse;

import java.util.Arrays;

/*2. Class student is as follows { private int sid, private string name , private int[] marks , 
float per}. Create array of 3 students. Hardcode data. Marks array is array of 3 
integers which represent students marks of 3 subjects. Marks are out of 100. Strictly 
use getter and setters to set and read values of all fields. Calculate percentage. Sort 
array in descending order of percentage. */

public class Que2 {
	
	public static void main(String[] args) {
		
		int []m1= {70,58,68,79,60};
		int []m2= {90,54,76,38,95};
		int []m3= {97,75,68,97,45};
		
		Student []s = new Student[3];
		s[0]= new Student(101, "Sudarshan", m1);
		s[1]= new Student(102, "Suraj", m2);
		s[2]= new Student(103, "Yogesh", m3);
		
//		ArrayList<Float> fper= new ArrayList<Float>();
//		for(int i=0;i<s.length;i++) {
//			float perc=s[i].calculatePer();
//			fper.add(perc);
//			System.out.println(s[i]);
//		}
//		System.out.println(fper);
//		Collections.reverse(fper);
//		System.out.println("Descending order of percentage : ");
//		System.out.println(fper);
		
		for(int i=0;i<s.length;i++) {
			Student temp=null;
			
			for(int j=i+1;j<s.length;j++) {
				
				if(s[i].calculatePer()<s[j].calculatePer()) {
					temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(s));
		
	}
	
	
}
class Student {
	private int stdid;
	private String name;
	private int []marks;
	float per;
	
	public Student() {
	
		
	}

	public Student(int stdid, String name, int[] marks) {
	
		this.stdid = stdid;
		this.name = name;
		this.marks = marks;
	}

	public int getStdid() {
		return stdid;
	}

	public void setStdid(int stdid) {
		this.stdid = stdid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	
	public float calculatePer() {
		
		int sum=0;
		for(int i=0;i<marks.length;i++) {
			sum=sum+marks[i];
		}
		per=(sum*100)/(marks.length*100);
		return per;
	}
	
	@Override
	public String toString() {
		return "\nStudent [stdid=" + stdid + ", name=" + name + ", marks=" + Arrays.toString(marks) + ", per=" + per
				+ "]";
	}
		
	
}
