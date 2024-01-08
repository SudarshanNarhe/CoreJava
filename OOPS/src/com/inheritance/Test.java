package com.inheritance;

public class Test {

	public static void display(Employee obj)
	{
		System.out.println(obj);
	}
	public static void calSalary(Employee e[])
	{
		for(int i=0; i<e.length;i++)
		{
			System.out.println(e[i].calSalary());
		}
		
		//OR
		/*
		 * for(Employee obj:e)
		 * obj.calSalary():
		 * 
		 */
			
	}
	public static void printEmployee(Employee e1[])
	{
		// syntax for instance of ---->> ref variable instanceof classname
		
		String str="";
		for(int i=0;i<e1.length;i++)
		{
			if(e1[i] instanceof SalesPerson)// if we take a employee first all persons are employee 
				                          //so it will return only one value
			{
				str="SalesPerson";
			}
			else if(e1[i] instanceof WageSalary)
			{
				str="WageSalary";
			}
			else if(e1[i] instanceof Manager)
			{
				str="Manager";
			}
			else 
			{
				str="Employee";
			}
		}
		System.out.println(str);
		
	}

	public static void main(String[] args) {
		
		Employee m = new Manager(121,"Sudarshan",50000,new MyDate(12,5,2023),50,1000);
		
		// in polymorphic reference  we can all the methods of super class and
				//overridden method of sub class
			
		m.calSalary();
		((Manager)m).setBonus(2500);
		 display(m);
		 
		 Employee obj[] =new Employee[5];
		 obj[0]= new Employee(101,"Sudarshan",70000,new MyDate(12,5,2023));
		 obj[1]= new Employee(102,"Pavan",40000,new MyDate(18,9,2023));
		 obj[2]= new Employee(103,"Rohit",30000,new MyDate(22,4,2023));
		 obj[3]= new Employee(104,"Rakesh",35000,new MyDate(12,7,2023));
		 obj[4]= new Employee(105,"Nitin",50000,new MyDate(28,9,2023));
		 
		 calSalary(obj);
		 System.out.println("------------------------------------------------------------------------");
//		 Employee obj1[] =new Employee[3];
//		 obj1[0]= new Manager(101,"Sudarshan",70000,new MyDate(12,5,2023),50,1000);
//		 obj1[1]= new WageSalary(102,"Pavan",40000,new MyDate(18,9,2023),8,50);
//		 obj1[2]= new SalesPerson(103,"Rohit",30000,new MyDate(22,4,2023),7,60,1000,100);
//		 
		 
		 printEmployee(obj);

	}

}
