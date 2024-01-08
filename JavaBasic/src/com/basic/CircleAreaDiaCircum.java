package com.basic;

public class CircleAreaDiaCircum {
    
	public static void main (String args[])
	{
		float  r, dia, area, circum;
		r = 23f;
		dia = 2*r;
		area = (float)(3.14 * r*r) ;
		circum =(float) (2*3.14*r);
		System.out.println("The Diameter of circle is :"+dia);
		System.out.println("The Area of a circle is :"+area);
		System.out.println("The Circumference of circle is :"+circum);
	}
}
