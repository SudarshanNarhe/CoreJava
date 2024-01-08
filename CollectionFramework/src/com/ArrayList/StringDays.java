package com.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

/*Create aarraylist of string. Add 7 days to list ( Monday , Sunday etc) 
Remove elements from list for which string length is more than 7*/

public class StringDays {

	public static void main(String[] args) {
		
		ArrayList<String>day= new ArrayList<String>();
		day.add("Monday");
		day.add("Tuesday");
		day.add("Wednesday");
		day.add("Thursday");
		day.add("Friday");
		day.add("Saturday");
		day.add("Sunday");
		System.out.println("Days are : "+day);
		Iterator<String>obj=day.iterator();
		while(obj.hasNext()) {
			if(obj.next().length()>7) {
				obj.remove();
			}
			
		}
		System.out.println("Days having length less than 7 is : "+day);
		
	}

}
