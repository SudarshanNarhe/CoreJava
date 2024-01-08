package com.code_Demo;

// hashcode demo 

public class MyDate {

			private int dd;
			private int mm; 
			private int yy;
			
			public MyDate ()
			{
				System.out.println("I am in default");
				
			}
			public MyDate(int dd,int mm, int yy)
			{
				System.out.println("I am in Para");
				this.dd=dd;
				this.mm=mm;
				this.yy=yy;
			}
			public void setDD(int dd)
			{
				this.dd=dd;
			}
			public int getDD()
			{
				return dd;
			}
			public void setMM(int mm)
			{
				this.mm=mm;
			}
			public int getMM()
			{
				return mm;
			}
			public void setYY(int yy)
			{
				this.yy=yy;
			}
			public int getYY()
			{
				return yy;
			}
			public String toString()
			{
				return dd+"/"+mm+"/"+yy;
			}
			@Override
			public boolean equals(Object obj)
			{
				System.out.println("I am in Equals");
				//MyDate d = new Object ();  ------>> it is not possible because the object is super class so typecast is important
				// i.e.    MyDate d = (MyDate)obj;
				MyDate d= (MyDate)obj;
				if(this.dd==d.dd && this.mm==d.mm && this.yy==d.yy)
				{
					return true;
				}
				else 
					return false;
			}
			@Override
			public int hashCode()
			{	
				System.out.println("I am in hashcode");
				final int prime =31;
				int result =1;
				result = prime*result+dd;
				return result;
				
			}
		
			public static void main(String[] args) {
				
				
				System.out.println("I am in main");
				MyDate d=new MyDate(12,5,2023);
				System.out.println(d);
				System.out.println(d.hashCode());
				System.out.println("__________________________________");
				MyDate d1 = new MyDate (13,5,2023);
				System.out.println(d1);
				System.out.println(d1.hashCode());
				System.out.println();
				System.out.println("____________________________________");
				MyDate d2 = d1;
				System.out.println(d2.hashCode());
				System.out.println(d.equals(d1));
				System.out.println("______________________________________");
				d=d1;
				System.out.println(d.equals(d1));
				
				
			}

	}


