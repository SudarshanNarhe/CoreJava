package com.containment;

/*WAP to have Department class created with id, name . Student class has
roll, name and Department object should have id and name. Assign and
print individual values in main method*/

public class Department {

	private String departmentname;
	private String id;
	private Student student[];
	
	public Department()
	{
		
	}
	
	public Department(String department, String id, Student student[])
	{
		this.departmentname=department;
		this.id=id;
		this.student=student;
	}
	public void setDepartmentname(String department)
	{
		departmentname=department;
	}
	public String getDepartmentname()
	{
		return departmentname;
	}
	public void setID(String id)
	{
		this.id=id;
	}
	public String getID()
	{
		return id;
	}
	public void setStudent(Student student[])
	{
		this.student=student;
	}
	public Student[] getStudent()
	{
		return student;
	}
	public String toString ()
	{
		return "Department name : "+departmentname+"\nStudent Id : "+id ;      //  +"\n"+student;
	}
	public void print()
	{
		for(Student a:student)
			System.out.println(a);
	}
	
	public static void main(String[] args) {
		
		Student arr[]=new Student [5];
		arr[0]=new Student(2,"Prashant");
		arr[1]=new Student(4,"Nitin");
		arr[2]=new Student(7,"Pavan");
		arr[3]=new Student(9,"Ajit");
		arr[4]=new Student(12,"Ishwar");
		
		//Student std=new Student(23,"Sudarshan");
		Department obj=new Department("Management Department ","Management 423",arr);
		System.out.println(obj);
		obj.print();

	}

}
