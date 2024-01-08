package com.VectorBasic;

/*
 * vector is a legacy class
 * its underlying data structure is growable array
 * default capacity 10
 * increase it size by double the capacity
 * vector is thread safe, unlike arraylist (only one thread can access data)
 * all methods in vector are synchronized, it gives thread safety (we need lock key to go inside that method)
 * 
 * 3 type of cursor: 1. Iterator-Universal Cursor(iterator method is in collection interface and hence this cursor can be used in all collections)
 * 					 2. ListIterator-only used in list specific classes
 * 					 3. Enumeration-it is available in only legacy classes vectorclasssname.elements() it gives enumeration 						cursor(Fail-safe)
 */


import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Demo {

	
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<>();
		al.add("Komal");
		al.add("Madhu");
		al.add("Anil");
		al.add("Sanju");
		al.add("Vaishu");
		
		ArrayList<Trainer> tr= new ArrayList<Trainer>();
		tr.add(new Trainer("Ishwar", 8, "Mechanical"));
		tr.add(new Trainer("Sudarshan", 3, "Managements"));
		tr.add(new Trainer("Aadarsh", 12, "B.E"));
		tr.add(new Trainer("Yogesh", 10, "Mcs"));
		tr.add(new Trainer("Suraj", 18, "MCA"));
		
		Vector<Trainer> tr1= new Vector<Trainer>(tr);
		Enumeration<Trainer> emr1= tr1.elements();
		while(emr1.hasMoreElements()) {
			System.out.println(emr1.nextElement());
		}
		Vector<String>tr2= new Vector<String>(al);
		for(String a : al) {
			System.out.println(a);
		}
		Iterator<String> itr3= tr2.iterator();
		while(itr3.hasNext()) {
			System.out.println(itr3.next());
		}
		Vector <String> emp= new Vector<>();
		
		emp.add("Ishawar");
		emp.add("Aadarsh");
		emp.add("Sudarshan");
		emp.add("Suraj");
		emp.add("Yogesh");
		
		System.out.println(emp.capacity());
		Enumeration<String> emr= emp.elements();
		while(emr.hasMoreElements()) {
			System.out.println(emr.nextElement());
		}
		
		Iterator<String>itr= emp.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		/*System.out.println(v.addAll(al)); //return boolean
		System.out.println(v);*/
		
		/*v.addAll(1, al);
		System.out.println(v);*/
		
		/*v.add(2, "W");
		System.out.println(v);*/
		
		System.out.println(tr1.firstElement());//returns object at index 0
		System.out.println(tr1.lastElement());//returns object at index v.size()-1
		//setElementAt, removeElementAt
		
	}
	
}
