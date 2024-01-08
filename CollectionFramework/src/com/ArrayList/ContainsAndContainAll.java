package com.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

/*Create arraylist ‘arrList’ within an arraylist. Use contains and containsall method 
 to check if given element and arraylists are present in ‘arrList’
Iterate through arraylist using foreach.*/

public class ContainsAndContainAll {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrList= new ArrayList<Integer>();
		arrList.add(21);
		arrList.add(31);
		arrList.add(67);
		arrList.add(78);
		arrList.add(42);
		arrList.add(11);
		
		System.out.println("Print array : "+arrList);
		
		System.out.println("To contain 12 : "+arrList.contains(12));
		System.out.println("To contain 10 : "+arrList.contains(10));
		
		ArrayList<Integer> arrList1 = new ArrayList<Integer>(Arrays.asList(21,31,42));
		System.out.println("To contain all 21,31,42: "+arrList.containsAll(arrList1));
		
		for(int i=0;i<arrList.size();i++) {
			System.out.print(arrList.get(i)+"\t");
		}
		
	}

}
