package com.oops;

public class Check_Output extends A{

	static {
		System.out.println("I am int Static of Check_Output");
	}
	
	public Check_Output() {

		System.out.println("I am in default...");
	}
	public Check_Output(int a)
	{	
		super();
		System.out.println("I am parameterized of Check_Output");
	}
	public static void main(String[] args) {
		
		
		System.out.println("I am in main methd");
		A obj= new Check_Output(5);
		System.out.println(obj);  //--->> it shows the hashcode because we didn't add display method
	}

}
class A{
	int a;
	static
	{
		System.out.println("I am in static of A");
	}
	A()
	{
		System.out.println("I am in default of A ");
	}
	
	public A(int a)
	{
		
	}
	
	
}