package com.AprilWritten;

/*10 )You have been tasked to create flats in a housing scheme. 
 * Each flat has a bhk number, area, price and height. 
 * Create three flats which are exact copies of each other in 
 * such a manner that changes made to one flat should reflect across all copies.[1M]*/

public class Que10 implements Cloneable{
	
	int bhkno;
	float area;
	double price;
	float height;
	
	public Que10() {
	
	}

	public Que10(int bhkno, float area, double price, float height) {
		
		this.bhkno = bhkno;
		this.area = area;
		this.price = price;
		this.height = height;
	}

	public int getBhkno() {
		return bhkno;
	}

	public void setBhkno(int bhkno) {
		this.bhkno = bhkno;
	}

	public float getArea() {
		return area;
	}

	public void setArea(float area) {
		this.area = area;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Que10 [bhkno=" + bhkno + ", area=" + area + ", price=" + price + ", height=" + height + "]";
	}
	
	public Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Que10 f1 = new Que10(101, 23.5f, 54000, 7f);
		
		System.out.println(f1);
		
		System.out.println("Copies : ");
		Que10 f4= (Que10) f1.clone();
		Que10 f5 = (Que10) f1.clone();
		Que10 f6 = (Que10) f1.clone();
		System.out.println(f4);
		System.out.println(f5);
		System.out.println(f6);
		
		System.out.println("After changing : ");
		f1.setPrice(84000);
		System.out.println(f1);
		System.out.println(f4);
		System.out.println(f6);
		System.out.println(f5);
	}
	
	
	
	
};
