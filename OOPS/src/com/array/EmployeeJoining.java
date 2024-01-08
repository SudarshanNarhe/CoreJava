package com.array;

/*WAP to print the employees from Employee[] array who has same joining date.
You have Employee class which has 4 attributes id, name, salary, date
(date is another object which has 3 attributes day, month, year) and 
add employee objects to your array*/

public class EmployeeJoining {

	private int id;
	private String name;
	private double salary;
	private JoiningDate date;
	
	EmployeeJoining()
	{
		
	}
	public EmployeeJoining(int id,String name,double salary,JoiningDate date)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.date=date;
	}
	public void setID(int id)
	{
		this.id=id;
	}
	public void setName(String name) 
		{
			this.name=name;
		}
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	public void Setdate(JoiningDate date)
	{
		this.date=date;
	}
	public int getID()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public double salary()
	{
		return salary;
	}
	public  JoiningDate date()
	{
		return date;
	}
	public String toString()
	{
			
		return "Employee ID :"+id+"\nName of Employee : "+name+"\nDate of Joining : "+date+"\nSalary of Employee :"+salary+"\n";
		
	}
	
	
	
	public static void main(String[] args) {
		
		EmployeeJoining obj[]=new EmployeeJoining[5];
		 obj[0]= new EmployeeJoining(1,"Sudarshan",45000,new JoiningDate(12,5,2023));
		 obj[1]= new EmployeeJoining(2,"Rohan",25000,new JoiningDate(9,7,2023));
		 obj[2]= new EmployeeJoining(3,"Pavan",50000,new JoiningDate(24,10,2023));
		 obj[3]= new EmployeeJoining(4,"Nitin",65000,new JoiningDate(12,5,2023));
		 obj[4]= new EmployeeJoining(5,"Mahii",35000,new JoiningDate(24,10,2023));
		 
		 for(int i=0;i<obj.length;i++)
		 {
			 for(int j=0;j<obj.length;j++)
			 {
				 if(obj[i].date.CompareDate(obj[j].date)&& i!=j)    //i!=j is due to they didn't show any output.
				 {
					 System.out.println(obj[i]);
					 break;
				 }
			 }
		 }
		 
		 
		 
		

	}

}
