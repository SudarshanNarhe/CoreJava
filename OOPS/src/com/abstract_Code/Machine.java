package com.abstract_Code;

/*Create an abstract class Machine with an implemented / concrete method 
rotate and an abstract method crush. Create a class Juicer which extends this 
abstract class Machine and implements method crush. Now, add another 
method filter in the class Juicer. In main method, 
a. Create an object of type Juicer and calls its crush, rotate and filter 
methods. 
b. Create an object of type Juicer with reference variable of Machine 
(Machine m = new Juicer). Check the methods available to m.*/


public abstract class Machine {
	
	
	
	public Machine() 
	{
		
		
	}
	public abstract String rotate();
	public abstract String crush();
	public void display()
	{
		
	}
	
	public static void main(String[] args) {
		 
		//Machine obj = new Machine();
		
	}

}

/*
 * 
 . Check –
a. Can we create an object of an abstract class?
---->> No. we cannot create a object of abstract class.

b. Can we declare a class abstract with no methods in it?
----->> Yes. We can make a abstract class with no methods in it.

c. Can we declare a class abstract even if it does not have any abstract 
method?
----->> Yes. We can make a make a abstract class without any abstract method

d. Can we declare an abstract class which has both abstract as well as 
implemented methods?
----->> Yes. We can but we cannot make a object of that class then..

e. Can a class extend 2 or more abstract classes?
------>> No. One class not extends 2 or more abstract classes.

f. Can an abstract class extend 2 or more abstract classes?
----->> No. Abstract class not extend 2 or more abstract classes.

g. Can an interface extend 1 or many abstract classes?
---->> No. for interface we required a only interface class.

h. Can an abstract class implements 1 or many interface?
---->> 

*
*/