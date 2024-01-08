package com.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayList2 {

	public static void main(String[] args) {
	
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(11);
		num.add(3);
		num.add(11);
		num.add(23);
		num.add(15);
		System.out.println(num);
		
		//show every element and sum...
		//1 by Traditional for loop
		int sum=0;
		for(int i=0;i<num.size();i++) {
			System.out.print(num.get(i)+"  ");
			sum+=num.get(i);
		}
		System.out.println("\nSum is : "+sum);
		
		//2 By enhanced for loop
		sum=0;
		for(int a : num) {
			System.out.print(a+"  ");
			sum+=a;
		}
		System.out.println("\nSum is : "+sum);
		
		//3 By Iterator
		 Iterator<Integer> itr= num.iterator();
		 while(itr.hasNext()) {
			 
			 System.out.print(itr.next()+"  ");
			
		 }
		 //we cannot add sum method by using again itr.next(); method it will give wrong output 
		 //because it gets next two times and it will skip a one object everytime
		 sum=0;
		 itr=num.iterator(); // we have to give value again because after show its on last object.
		 while (itr.hasNext()) {
			 
			 sum+=itr.next();
		 }
		 System.out.println("\nSum is : "+sum);
		 
		 num.remove(2);
		 System.out.println(num); 
		 
		//Converting ArrayList object to Array ---->>
		Object[]i = num.toArray(); // we can't write here as a int []i = num.toArray(); 
		 						  //because it cannot transfer from object to int
		System.out.println(Arrays.toString(i));	
		
		Integer []arr = num.toArray(new Integer[num.size()]);
		System.out.println(Arrays.toString(arr));
		
		List<Integer> num1= Arrays.asList(1,2,3,4,5,6);
		System.out.println(num1);
		
		
		
	}

}
