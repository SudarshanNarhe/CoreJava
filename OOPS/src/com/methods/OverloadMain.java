package com.methods;

public class OverloadMain {

	public static void add(int i,int j, int k)
	{
		int a=i+j+k;
		System.out.println(a);
	}
	public static void multi(int i, int j, int k)
	{
		int b=i*j*k;
		System.out.println(b);
	}
	
	
	
	public static void main(String[] args) {
		
		OverloadMain.add(12, 2, 1);
		OverloadMain.multi(1, 2, 3);
	}

}
