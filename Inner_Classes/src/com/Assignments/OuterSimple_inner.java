package com.Assignments;

/*1. Create class Outer in which you will have private , public , static and static final variables. 
Create static and non static inner class in ‘Outer’ class.
Try to access all variables in both inner classes and 
check which are not accessible.

*
*2. Create objects on static and non static inner classes in main method. 
*Access methods ,variable of these classes in main method.

3. Create static and non static variables in both above inner classes.

4. Try to create static method in non-static inner class



*/

public class OuterSimple_inner {

	private int num=10;
	public int num1=20;
	static int num2=30;
	static final int num3=40;
	
	class inner{
		static int b=15;
		int b1=80;
		
		public static void sum() {
			System.out.println("Sum is : "+(num2+num3));
			
		}
		
		public void show() {
			System.out.println("In non-static class ");
			System.out.println("num : "+num);
			System.out.println("num1 : "+num1);
			System.out.println("num2 : "+num2);
			System.out.println("num3 : "+num3);
		}
	}
		
	static class inner2{
		static int b=30;
		int b2=60;
		
		public static void sum() {
			System.out.println("Sum : "+(num2+num3));
		}
		
		public void show2() {
			//Outer1 obj = new Outer1();
			display(); // we cannot access the non-static fields in static class
			System.out.println("In static class ");
		//	System.out.println("num : "+num);  //Cannot make a static reference to the non-static field.
		//	System.out.println("num1 : "+num1);
			System.out.println("num2 : "+num2);
			System.out.println("num3 : "+num3);
		}
		
	}
	public static void display() {
		System.out.println("I am in display....");
	}
	
	public static void main(String[] args) {
		
		
		OuterSimple_inner.inner in= new OuterSimple_inner().new inner();
		in.show();
		inner.sum();
		
		inner2 in2=new inner2();
		in2.show2();
		inner2.sum();
		System.out.println("static variable of static class : "+inner2.b); //static variable of static class
		System.out.println("non-static variable of static class : "+in2.b2);  //non-static variable of static class
		
		System.out.println("static variable of non-static class : "+inner.b);// static variable of non-static class 
		System.out.println("non-static variable of non-static class : "+in.b1); // non-static variable of non-static class
		
	}

}
