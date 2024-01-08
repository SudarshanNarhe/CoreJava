package com.inheritance;

public class Manager extends Employee{

	private int noOfemp;
	private int bonus;
	
	public Manager ()
	{
		noOfemp=0;
		bonus=0;
	}
	public Manager (int id, String name, double salary, MyDate d, int noemp,int bonus)
	{
		super(id,name,salary,d);
		this.noOfemp=noemp;
		this.bonus=bonus;
	}
	public void setBonus (int bonus)
	{
		this.bonus=bonus;
	}
	public int getBonus()
	{
		return bonus;
	}
	public void setEmpNo(int empNo)
	{
		this.noOfemp=empNo;
	}
	public int getEmpNo()
	{
		return noOfemp;
	}
	
	@Override
	public String toString() {
		return super.toString()+"\nNo of Employee =" + noOfemp + "\nBonus=" + bonus ;
	}
	@Override
	public double calSalary()
	{
		double sal =super.calSalary()+bonus;
		super.setSalary(sal);
		return sal;
		
	}
	public static void main(String[] args) {
		
		Manager mg = new Manager(101,"Sudarshan",45000,new MyDate(12,5,2023),50,1000);
		mg.calSalary();
		System.out.println(mg);

	}

}
