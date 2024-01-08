package com.test5;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList_Reverese {

	public static void main(String[] args) {
		
		ArrayList<String> str= new ArrayList<String>();
		str.add("Sudarshan");
		str.add("Yogesh");
		str.add("Pavan");
		str.add("Utkarsha");
		str.add("Ishwar");
		str.add("Vishal");
		str.add("Aadarsh");
		
		System.out.println("Original : \n"+str);
		
		Collections.sort(str);
		
		System.out.println("Sorted : \n"+str);
		
		Collections.reverse(str);
		
		System.out.println("Reverse of its natural order : \n"+str);
		
	}
	
}
