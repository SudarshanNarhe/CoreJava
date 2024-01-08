package com.finalDemo;


	final public class SalesPerson extends Employee
	{
		private double hr;
		private double rate;
		
		public SalesPerson()
		{
			this.hr=0;
			this.rate=0;
		}
		public SalesPerson(int id, String name, double salary, MyDate d,double hr,double rate)
		{
			super(id,name,salary,d);
			this.hr=hr;
			this.rate=rate;
		}
		
		@Override
		public String toString() {
			return super.toString()+"\nSalesPerson hr=" + hr + "\n rate=" + rate ;
		}
//		@Override
//		public double getSalary()
//		{
//			super.getSalary();
//		}
		public static void main(String[] args) {
			
			SalesPerson sp=new SalesPerson(101,"Sudarshan",35000,new MyDate(12,5,2023),10,50);
			System.out.println(sp);

		}

	}

	

