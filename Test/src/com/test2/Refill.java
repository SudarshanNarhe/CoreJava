package com.test2;

public class Refill {
		
	String colour;
	int lenght;
	Nib n;
	
	public Refill() {
		
	}
     public Refill(String colour, int length, Nib n)
     {
		this.colour=colour;
		this.lenght=length;
		this.n=n;
	}
     
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getLenght() {
		return lenght;
	}
	public void setLenght(int lenght) {
		this.lenght = lenght;
	}
	public Nib getN() {
		return n;
	}
	public void setN(Nib n) {
		this.n = n;
	}
	@Override
	public String toString() {
		return "Refill [colour=" + colour + ", lenght=" + lenght + ", n=" + n + "]";
	}
	
	public static void main(String[] args) {
		
		Refill ob = new Refill("Blue",1,new Nib("Plastic",2));
		System.out.println(ob);
	}

}
