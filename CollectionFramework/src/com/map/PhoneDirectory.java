package com.map;

import java.util.ArrayList;

/*WAP Phone Directory application in java using a Map.
The phone directory should allow users to:

Add a contact with a name and phone number.
Remove a contact by name.
Retrieve the phone number associated with a given name.
Display the entire phone directory.*/

public class PhoneDirectory {
	
	private String name;
	private ArrayList<Long> phoneNo;
	
	public PhoneDirectory() {
		
	}
	
	public PhoneDirectory(String name, ArrayList<Long> phoneNo) {
		this.name = name;
		this.phoneNo = phoneNo;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Long> getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(ArrayList<Long> phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	@Override
	public String toString() {
		return "Name=" + name + ", Phone No=" + phoneNo;
	}
		

}
