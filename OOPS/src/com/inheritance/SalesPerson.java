
package com.inheritance;

public class SalesPerson extends WageSalary
{
	private double sale;
	private double comm;
	
	public SalesPerson()
	{
		this.sale=0;
		this.comm=0;
	}
	public SalesPerson(int id, String name, double salary, MyDate d,double hr,double rate,double sale,double comm)
	{
		super(id,name,salary,d,hr,rate);
		this.sale=sale;
		this.comm=comm;
	}
	@Override
	public double calSalary()
	{
		double sal=super.calSalary()+sale*comm;
		super.setSalary(sal);
		return sal;
	}
	public String toString()
	{
		return super.toString()+"\nSales : "+sale+"\nCommission : "+comm;
	}
	

	public static void main(String[] args) {
		
		SalesPerson sp=new SalesPerson(12,"Sudarshan",35000,new MyDate(23,9,2023),10,50,1000,0.2);
		sp.calSalary();
		System.out.println(sp);
		
//		SalesPerson obj= new SalesPerson(); SalesPerson obj1 = new SalesPerson();
//		obj.calSalary(); obj1.calSalary(); System.out.println(obj);System.out.println(obj1);
	}

}
