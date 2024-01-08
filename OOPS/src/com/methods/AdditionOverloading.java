package com.methods;

public class AdditionOverloading {

	public void addition(int i, int j, int k)
	{
		System.out.println("The Addition is : "+(i+j+k));
		
	}
	
	public static void main(String[] args) {
		 
		AdditionOverloading obj=new AdditionOverloading();
		obj.addition(10, 20, 30);

		
	}

}
