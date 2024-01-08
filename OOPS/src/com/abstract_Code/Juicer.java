package com.abstract_Code;

/* Que 1 Create an abstract class Machine with an implemented / concrete method 
rotate and an abstract method crush. Create a class Juicer which extends this 
abstract class Machine and implements method crush. Now, add another 
method filter in the class Juicer. In main method, 
a. Create an object of type Juicer and calls its crush, rotate and filter 
methods. 
b. Create an object of type Juicer with reference variable of Machine 
(Machine m = new Juicer). Check the methods available to m.*/


/*Que 2 Above we created an abstract class Machine with an abstract method crush
and a concrete / implemented method rotate. Now create another abstract 
class Mixer which extends the abstract class Machine, has method crush 
implemented and has an additional concrete method blend. In main create an 
object of class of Mixer. Call methods rotate, blend and crush*/

public class Juicer extends Machine{

	public Juicer() {
		
	}
	
	@Override
	public String rotate() {
		// TODO Auto-generated method stub
		return "Rotate";
	}

	@Override
	public String crush() {
		// TODO Auto-generated method stub
		return "Crush";
	}
	public void filter()
	{
		System.out.println("Filter");
	}
	
	

	@Override
	public String toString() {
		return "Juicer [rotate()=" + rotate() + ", crush()=" + crush() + "]";
	}

	public static void main(String[] args) {
		
		Juicer jr = new Juicer();
		jr.crush();
		jr.filter();
		jr.rotate();
		System.out.println(jr);
		Machine m= new Juicer();
		m.crush();
		m.rotate();
		
	}

}
