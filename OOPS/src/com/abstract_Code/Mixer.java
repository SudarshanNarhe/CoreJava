package com.abstract_Code;

/*Que 2 Above we created an abstract class Machine with an abstract method crush
and a concrete / implemented method rotate. Now create another abstract 
class Mixer which extends the abstract class Machine, has method crush 
implemented and has an additional concrete method blend. In main create an 
object of class of Mixer. Call methods rotate, blend and crush*/

public class Mixer extends Machine{

	public Mixer() {
		
	}

	@Override
	public String rotate() {
		
		return "Rotate";
	}

	@Override
	public String crush() {
		
		return "Crush";
	}
	public void blend()
	{
		System.out.println("Blend");
	}
	
	@Override
	public String toString() {
		return "Mixer [rotate()=" + rotate() + ", crush()=" + crush() + "]";
	}

	public static void main(String[] args) {
		
		Mixer obj = new Mixer();
		obj.blend();
		obj.crush();
		obj.rotate();
		System.out.println(obj);
	}

}
