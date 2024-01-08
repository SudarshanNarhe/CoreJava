package com.test5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ShipList {

	public static void main(String[] args) {
		
		List<Shipment> list= new ArrayList<Shipment>();
		list.add(new Shipment(101, "Ajit",new Address("Pimpri", "Pune", "Maharashtra") ,new MyDate(12,02,2012)));
		list.add(new Shipment(203, "Sudarshan", new Address("Nighoj","A.nagar", "Kerla"), new MyDate(23,4,2015)));
		list.add(new Shipment(501, "Pavan",new Address("Vadner", "Mumbai", "Maharashtra") ,new MyDate(14,3,2019)));
		list.add(new Shipment(405, "Nitin", new Address("Near Mandir","Nagpur", "Kerla"), new MyDate(20,12,2021)));
		list.add(new Shipment(802, "Yogesh",new Address("Vadgaon", "Chennai", "Hydrabad") ,new MyDate(8,9,2013)));
		list.add(new Shipment(734, "Ishwar", new Address("Narhe","Kurla", "UttarPradesh"), new MyDate(17,6,2021)));
		list.add(new Shipment(320, "Suraj",new Address("Yeola", "Nashik", "Maharashtra") ,new MyDate(25,2,2021)));
		list.add(new Shipment(672, "Abhishek", new Address("Shirur","Pune", "Maharashtra"), new MyDate(24,10,2022)));
		
		SortByCities obj = new SortByCities();
		Collections.sort(list,obj);
		
		ListIterator<Shipment> itr =list.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
