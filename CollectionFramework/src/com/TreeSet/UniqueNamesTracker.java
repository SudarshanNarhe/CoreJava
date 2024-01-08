package com.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

/*WAP to create  Unique Names Tracker
The program should allow users to perform the following operations:

Add a Name: Add a new name to the set of unique names.

Remove a Name: Remove a specified name from the set.

Check if Name Exists: Check if a given name exists in the set.

Display All Names: Display all the unique names in the set.*/


public class UniqueNamesTracker {
	
	TreeSet<String> names = new TreeSet<String>();{
			names.add("Sudarshan");
			names.add("Pavan");
			names.add("Aadarsh");
			names.add("Shubhangi");
			names.add("Suraj");
			names.add("Snehal");
			names.add("Ishwar");
			names.add("Utkarsha");
			names.add("Yogesh");
	}
	
	public void show() {
		Iterator<String> itr= this.names.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
	public void addName(String str) {
		if(!this.names.contains(str)) {
			this.names.add(str);
			this.show();
		}
		else
			System.out.println("Name is Already Exist we cannot add Duplicates");
		
	}
	
	public void removeName(String str) {
		if(this.names.contains(str)) {
			this.names.remove(str);
			this.show();
		}
		else
			System.out.println("Name is NOT exist to remove");
	}
	
	public void checkName(String str) {
		
		if(this.names.contains(str)) {
			System.out.println("The Name "+str+" is Exist");
		}
		else
			System.out.println("Name is Not Exist");
	}
	
	
	
}
