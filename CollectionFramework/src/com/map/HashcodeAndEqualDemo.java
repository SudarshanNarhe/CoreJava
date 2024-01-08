package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashcodeAndEqualDemo {

	public static void main(String[] args) {
		
		Map<Apple,Integer> appleMap=new HashMap<>();
		Apple a1=new Apple(150,"Shimala Apple");
		System.out.println(a1.hashCode());
		appleMap.put(a1, 200);
		Apple a2=new Apple(300, "Washington apple"); 
		appleMap.put(a2, 3500);
		System.out.println(a2.hashCode());
		Apple a3=new Apple(450, "Green Apple");
		System.out.println(a3.hashCode());
		appleMap.put(a3, 4508);
		
		System.out.println("*****************************************************");

		Set<Entry<Apple, Integer>> set=appleMap.entrySet();
		Iterator<Entry<Apple, Integer>> itr=set.iterator();
		while(itr.hasNext())
		{
			Entry<Apple, Integer> e=itr.next();
			System.out.println("key:"+ e.getKey());
			System.out.println("Value: "+e.getValue());
		}
		
		Apple a4= new Apple(150, "Shimala Apple");
		System.out.println(a4.hashCode());
		System.out.println(appleMap.get(a4)); 
		
		System.out.println("*****************************************************");
		appleMap.put(a4, 500);
		 itr=set.iterator();
		while(itr.hasNext())
		{
			Entry<Apple, Integer> e=itr.next();
			System.out.println("key:"+ e.getKey());
			System.out.println("Value: "+e.getValue());
		}

		
		// It Will gives Null values because create a new value in memory and gives a new hashCode
		// to solve these problem we have to write a logic for hashCode and equal methods...
		// It will done only on keys because only keys are unique for values and we have to write these logic in only keys class
	}
	
	/* 
	    1) If two objects are equal, then they must have the same hash code.
		2) If two objects have the same hash code, they may or may not be equal.
	 */

}
