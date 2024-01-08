package com.test5;

import java.util.Comparator;

public class SortByCities implements Comparator<Shipment> {

	@Override
	public int compare(Shipment o1, Shipment o2) {
		if(o1.getAddress().getCity().equals(o2.getAddress().getCity())) {
			return o1.getDate().CompareTo(o2.getDate());
		}
		else
			return o1.getAddress().getCity().compareTo(o2.getAddress().getCity());
		
	}

}
