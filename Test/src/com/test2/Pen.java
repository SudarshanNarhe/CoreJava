package com.test2;

public class Pen {
	
	int caplength;
	String brand;
	Refill rel;
	Nib nib;
	
	public Pen() 
	{
		
	}
	public Pen(int cap, String brand, Refill rel)
	{
		caplength =cap;
		this.brand=brand;
		this.rel=rel;
		
		
	}
	public int getCaplength() {
		return caplength;
	}



	public void setCaplength(int caplength) {
		this.caplength = caplength;
	}



	public String getBrand() {
		return brand;
	}



	public void setBrand(String brand) {
		this.brand = brand;
	}



	public Refill getRel() {
		return rel;
	}



	public void setRel(Refill rel) {
		this.rel = rel;
	}



	public Nib getNib() {
		return nib;
	}

	public void setNib(Nib nib) {
		this.nib = nib;
	}
	

	@Override
	public String toString() {
		return "Pen [caplength=" + caplength + ", brand=" + brand + ", rel=" + rel + ", nib=" + nib + "]";
	}
	public static void main(String[] args) {
		
		Pen obj = new Pen(1,"Cello",new Refill("Blue",2,new Nib("Plastic",2)));
		
		System.out.println(obj);
		
		
		
		
	}

}
