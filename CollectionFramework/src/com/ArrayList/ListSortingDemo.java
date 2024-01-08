package com.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ListSortingDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> num= new ArrayList<Integer>(Arrays.asList(1,0,2,3,4,2,7,8));
		System.out.println("Before Sorting : ");
		System.out.println(num);

		Collections.sort(num);
		System.out.println("After Sorting : ");
		System.out.println(num);
		
		Collections.reverse(num);
		System.out.println("After Reverse : ");
		System.out.println(num);
		
		ArrayList<String >str = new ArrayList<String>(Arrays.asList("Utkarsh","Sudarshan","snehal","Aadarsh"));
		System.out.println("Before Sorting : ");
		System.out.println(str);

		Collections.sort(str);
		System.out.println("After Sorting : ");
		System.out.println(str);
		//It will return Capital value because it will sort on the basis of the ascii value
	}

}
