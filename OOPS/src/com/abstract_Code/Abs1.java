package com.abstract_Code;

/*Create 2 abstract classes Abs1 and Abs2 each with different implemented 
methods doAbs1() and doAbs2() respectively. Check if you can create a class 
Temp which extends both the abstract classes. (Note- A class cannot extend 2 
classes simultaneously)*/

public abstract class Abs1 {

	public Abs1()
	{
			
	}
	public abstract int abs1();
	
}


 abstract class Abs2 extends Abs1
{
	
	 public Abs2()
	 {
		 
	 }
	 public abstract int abs2();
	 
}
 
 abstract class Temp extends Abs1   // one class cannot extends 2 classes simultaneously.
 {
	 public Temp()
	 {
		 
	 }
 }
 
 
 
