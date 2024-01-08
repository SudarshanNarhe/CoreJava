package com.FailFastSlow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class Demo {

	public static void main(String[] args) {
		
		Map<String, String> m= new HashMap<String, String>();
		m.put("Utkarsha", "Pune");
		m.put("Sudarshan", "Nagar");
		m.put("Suraj", "Pandharpur");
		m.put("Aadarsh", "Delhi");
		
		Set<Entry<String, String>> set=m.entrySet();
		Iterator<Entry<String, String>> itr=set.iterator();
		while(itr.hasNext()) {
			
				System.out.println(itr.next());
				//m.put("Ajit", "Mumbai");  
		}
		System.out.println("_____________________________________________________________");

		//It will throw the concurrentModification exception while adding the elements
		//For that we use Concurrent HashMap
		ConcurrentHashMap<String, String> cm= new ConcurrentHashMap<String, String>();
		cm.put("Utkarsha", "Pune");
		cm.put("Sudarshan", "Nagar");
		cm.put("Suraj", "Pandharpur");
		cm.put("Aadarsh", "Delhi");
		
		Iterator<String> it = cm.keySet().iterator();   
		while (it.hasNext()) {   
			String key = it.next();   
			System.out.println(key + " : " + cm.get(key));   
			// This will reflect in iterator.   
			// This means it has not created separate copy of objects  
			cm.put("Ajit", "Mumbai");
		}
		System.out.println("_____________________________________________________________");
		System.out.println(cm);
		System.out.println("_____________________________________________________________");

		ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(1,2,3,4,5));

		Iterator<Integer>itr1=arr.iterator();
		while(itr1.hasNext())
		{
			//System.out.println(itr1.next());
			//arr.add(15);
			if(itr1.next()%2==0)
				itr1.remove();
		}
		System.out.println(arr);
		System.out.println("_____________________________________________________________");

		CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<Integer>(new Integer[] { 1, 7, 9, 11 });   
		Iterator<Integer> itr2 = list.iterator();   
		while (itr2.hasNext()) {   
			Integer i = (Integer)itr2.next();   
			System.out.println(i);   
			if (i == 7)   
				list.add(15); // It will not be printed  
			//This means it has created a separate copy of the collection  
		}   
		System.out.println(list);
		
	}

}
