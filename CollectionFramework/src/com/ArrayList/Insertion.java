package com.ArrayList;

import java.util.ArrayList;

//Create arraylist of 10 integers. Insert an element at 7th position.

public class Insertion {

	public static void main(String[] args) {
		
		ArrayList<Integer>num = new ArrayList<Integer>();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		num.add(6);
		num.add(7);
		num.add(8);
		num.add(9);
		num.add(10);
	
		System.out.println("Original : "+num);
		num.add(7, 23);
		System.out.println("After Insertion : "+num);
	}

}
