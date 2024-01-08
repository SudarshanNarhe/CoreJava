package com.array;

/*Employee class is as follows .

Employee {
int empno ;
String name ;

Department dept ;}
Where dept is object of department class. Department class
as deptId and deptname.      
Write a program to create array of 3 employees. Each
employee will have different department. */


public class NewEmployee {

	private int empno;
	private String name;
	private NewDepartment dept;
	
	public NewEmployee()
	{
		
	}
	public NewEmployee(int empno, String name, NewDepartment dept)
	{
		this.empno=empno;
		this.name=name;
		this.dept=dept;
	}
	
	public static void main(String[] args) {
		
		NewEmployee emp[]=new NewEmployee[3];
		emp[0]=new NewEmployee(11,"Sudarshan",new NewDepartment(22,"Java_Developers"));
		emp[1]=new NewEmployee(23,"Pavan",new NewDepartment(21,"SQL"));
		emp[2]=new NewEmployee(15,"Adarsh",new NewDepartment(23,"DBMs"));
		
		for(int i=0;i<emp.length;i++)
		{
			System.out.println(emp[i].dept);
			System.out.println("Employment No : "+emp[i].empno);
			System.out.println("Employment Name : "+emp[i].name);
			System.out.println("_______________________________________");
		}

	}

}
