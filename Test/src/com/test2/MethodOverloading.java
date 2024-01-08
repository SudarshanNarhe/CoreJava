package com.test2;

public class MethodOverloading {
	
	double v;
	
	public MethodOverloading() {
		
	}
	
	public double calVolume(double r)
	{
		v= 4/3*22/7*r*r*r;
		return v;
	}
	public double calVolume(double h,double r)
	{
		v= 22/7*r*r*h;
		return v;
	}
	public double calVolume(double l, double b, double h)
	{
		v= l*b*h;
		return v;
	}
	
	@Override
	public String toString() {
		return "Volume is : "+v ;
	}

	public static void main(String[] args) {
		
		MethodOverloading obj = new MethodOverloading();
		obj.calVolume(2.4, 6.7,5);
		System.out.println(obj);
		
	}

}
