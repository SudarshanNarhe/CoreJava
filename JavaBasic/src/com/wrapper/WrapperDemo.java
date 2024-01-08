package com.wrapper;

public class WrapperDemo {

	public static void main(String[] args) {
		
		int a= 19;
		Integer b= new Integer(a);
		Integer c=29;
		
		float e=23.4f;
		Float f= new Float(e);
		Float f1= 56.3f;
		
		double n=67;
		Double m=87.23;
		
		short t=3526;
		Short t1=363;
		
		long h=327872;
		Long k=(long) 384637648;
		
		byte o=72;
		Byte p=23;
		
		
		
		System.out.println(c.parseInt("6"));
		
		System.out.println(b.byteValue());
		System.out.println(b.doubleValue());

	}

}
