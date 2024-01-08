package com.inheritance;

/* Create a class Teenager which extends Kid created above (#14). Implement 
readBook() differently in Teenager class. In main method, declare 2 variables k1, 
k2 of type Kid. Create objects of type BigKid and Teenager such that K1 should 
reference object of class BigKid and K2 should reference object of class Teenager. 
Call their respective readBook() methods. The output is different from both the 
method calls even if the variable type is the same i.e. Kid. This is compile time 
polymorphism example.*/

public class Teenager extends Kid {

	public Teenager() 
	{
		
	}

	public static void main(String[] args) 
	{
		
		Bigkid k1 = new Bigkid();
		Teenager k2 = new Teenager();
		k1.readBook();
		k2.readBook();
		
		
	}

}
