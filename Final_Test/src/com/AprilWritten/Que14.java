package com.AprilWritten;

import java.util.Arrays;

/*15) There are two classes Person and student 
 * Student inherits all the properties of Person person has firstname,lastname,id.[1M]
A Student class constructor, which has  parameters:
A string firstname .
A string lastname .
An integer id .
An integer array (or vector) of test scores
A char calculate() method that calculates a Student object’s average and 
returns the grade character representative of their calculated average
*/

class Person{
	
	String firstname;
	String lastname;
	int id;
	
	public Person() {
		
	}

	public Person(String firstname, String lastname, int id) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.id = id;
	}

	@Override
	public String toString() {
		return "firstname=" + firstname + ", lastname=" + lastname + ", id=" + id + "]";
	}
	
}

class Student1 extends Person{
	
	int marks[];
	char grade;
	
	public Student1() {
		super();
		
	}

	public Student1(String firstname, String lastname, int id,int []marks) {
		super(firstname, lastname, id);
		this.marks=marks;
		calGrade();
	}
	public char calGrade() {
		
		int sum=0;
		float avg;
		for(int i=0;i<marks.length;i++) {
			sum=sum+marks[i];
		}
		avg=sum/5;
		if(avg>90)
			return grade='A';
		else if(avg >80)
			return grade='B';
		else if(avg >70)
			return grade='C';
		else if(avg >50)
			return grade='D';
		else
			return grade='F';

	}

	@Override
	public String toString() {
		return super.toString()+ "[marks=" + Arrays.toString(marks) + "Grade : "+grade;
	}
	
}

public class Que14 {
	
	public static void main(String[] args) {
		
		int arr1[]= {89,70,70,50,60};
		int arr2[]= {79,89,85,76,43};
		int arr3[]= {93,64,60,87,79};
		int arr4[]= {89,70,68,92,40};
		int arr5[]= {70,89,60,62,70};
		
		Student1 std1 = new Student1("Yogesh", "Nawale", 101, arr1);
		Student1 std2 = new Student1("Sudarshan", "Narhe", 102, arr2);
		Student1 std3 = new Student1("Suraj", "Rokade", 103, arr3);
		Student1 std4 = new Student1("Ishwar", "Zirpe", 104, arr4);
		Student1 std5 = new Student1("Aadarsh", "Jadhav", 105, arr5);
		
		System.out.println(std1+"\n"+std2+"\n"+std3+"\n"+std4+"\n"+std5);

		
	}
	
}
