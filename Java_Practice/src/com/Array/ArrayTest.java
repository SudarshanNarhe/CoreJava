package com.Array;

public class ArrayTest {

	
	public static void main(String[] args) {
		
		int []print = new int [] {0,1,2,3,4,5};
		//int []print1= new int [] {0,1,2,3,4,5};
		System.out.print("\"Prints=");   //------>>   \ print the doublecoat also 
		System.out.print(print[0]+print[5]+print[2]+"\"");
		
		
		
//		if(print==print1)
//		{
//			System.out.println("Same");
//		}
//		else
//			System.out.println("Not Same");
//		
//		System.out.println(print.hashCode());
//		System.out.println(print1.hashCode());
		
		System.out.println("\nCreate Array by using object ");
		Object b []= {1,2,3,4,"Sudarshan",4.5,'d'};
		for(Object a : b) {
			System.out.print(a + "  ");
		}
		
		
	}

}
