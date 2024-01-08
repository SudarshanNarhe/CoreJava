package com.NovEclipse;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

/*Q2. Write a code for below case study:
6 Friends went for dinner and contributed some amount to pay Hotel bill of Rs.4500.
Some friends contributed less or some contributed more amount than the individual’s actual contribution. 
Accept contribution and name of each in code.  Store this information in a Hashmap. 
Create another map which contains details of amount for each friend that he should get or 
he should pay more to somebody from group so that they will pay exact contribution for dinner. 
If they have paid excess their amount will be negative else positive.						[1]
*/

public class Que2 {
	
	public static void main(String[] args) {
		
		int bill=4500;
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("Sudarshan", 1000);
		map.put("Yogesh", 700);
		map.put("Suraj", 900);
		map.put("Akash", 850);
		map.put("Ruturaj", 750);
		map.put("Ishwar", 300);
		
		HashMap<String, Integer> newmap = new HashMap<String, Integer>();
		
		Iterator<Entry<String, Integer>> entry = map.entrySet().iterator();
		while(entry.hasNext()) {
			Entry<String, Integer> en = entry.next();
			System.out.println(en.getKey()+"  "+en.getValue());
			int avg=bill/map.size();
			//System.out.println(avg);
			if(!newmap.containsKey(en.getKey())&& en.getValue()>avg) {
				newmap.put(en.getKey(), -(en.getValue()));
			}
			else
				newmap.put(en.getKey(), en.getValue());
		}
		System.out.println("New Map : ");
		Iterator<Entry<String, Integer>> entry1= newmap.entrySet().iterator();
		while(entry1.hasNext()) {
			Entry<String, Integer> en1= entry1.next();
			System.out.println(en1.getKey()+" "+en1.getValue());
		}
		
		
	}
}
