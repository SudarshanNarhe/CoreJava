package com.inheritance;
/*WAP to create a class Kid with method readBook() and another method readBook () with 2
parameters. The method readBook here is over-loaded (same method name but different
parameters) Create a class BigKid which extends Kid created above. 
Implement readBook() differently in BigKid class.
 Here the method readBook() has been over-ridden in the child class BigKid()*/

public class Kid {

	public Kid()
	{
		
	}
	public void readBook()
	{
		System.out.println("Reading......");
	}
	public void readBook(String read, String reading )
	{
		System.out.println(read);
		System.out.println(reading);
	}
	
	public static void main(String[] args) {
		

	}

}
