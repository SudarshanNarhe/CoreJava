package com.basic;

public class BodmasProblems {

	public static void main(String[] args) {
		int a= -5, b= 8, c= 6, total;
		total= a+b*c;
		System.out.println(total);
		
		int k= 55, l= 9, m= 9, total1;
		total1 = (k+l)%m;
		System.out.println(total1);
		
		int p= 20, q= 3, r= 5, s= 8, total3;
		total3 = p+(-q*r)/s;
		System.out.println(total3);
		
		int e=5, f= 15, g= 3, h= 2, i= 8, j=3, total4;
		total4 = e+f/g*h-i%j;
		System.out.println(total4);
		
		float total5 = (float)((25.5*3.5-3.5*3.5)/(40.5-4.5));
		System.out.println(total5);
		
	    float total6 =(float)( 4.0*(1-(1.0/3)+(1.0/5)-(1.0/7)+(1.0/9)-(1.0/11)));
	    System.out.println(total6);
	    
	    double total7 =( 4.0*(1-(1.0/3)+(1.0/5)-(1.0/7)+(1.0/9)-(1.0/11)));
	    System.out.println(total7);

	}

}
