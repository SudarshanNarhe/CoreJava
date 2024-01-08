package com.AprilWritten;

/*17) There is a Bakery (factory)making different kinds of  
 * confectionary(cake, cream roll , pastry ,bread).
 *  WAP which implements the Bakery to produce the above confectionary.
 *  Show main invoking this factory. [1M]*/

interface confectionary{
	
	 void produce(int a);
}

class Cake implements confectionary{

	@Override
	public void produce(int a) {
		System.out.println(a+" Cake is produced");
		
	}
	
}

class CreamRoll implements confectionary{

	@Override
	public void produce(int a) {
		System.out.println(a+" CreamRoll is produced");
		
	}
	
}

class Pastry implements confectionary{

	@Override
	public void produce(int a) {
		System.out.println(a+" Pastry is produced");
		
	}
	
}

class Bread implements confectionary{

	@Override
	public void produce(int a) {
		System.out.println(a+" Bread is produced");
		
	}
	
}

public class Que16{
	
	public static void main(String[] args) {
		
		Cake c= new Cake();
		CreamRoll cr= new CreamRoll();
		Bread b = new Bread();
		Pastry p = new Pastry();
		
		c.produce(30);
		cr.produce(59);
		b.produce(80);
		p.produce(10);
		
		
	}
	
	
}
