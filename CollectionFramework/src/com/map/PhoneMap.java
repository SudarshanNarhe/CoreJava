package com.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/*WAP Phone Directory application in java using a Map.
The phone directory should allow users to:

Add a contact with a name and phone number.
Remove a contact by name.
Retrieve the phone number associated with a given name.
Display the entire phone directory.*/

public class PhoneMap {

	public static void main(String[] args) {
		
		ArrayList<Long> arr = new ArrayList<Long>(Arrays.asList(6457283792l, 987658796l));
		ArrayList<Long> arr1 = new ArrayList<Long>(Arrays.asList(8574883738l, 7463738982l));
		ArrayList<Long> arr2 = new ArrayList<Long>(Arrays.asList(6574764748l, 8272647301l));
		ArrayList<Long> arr3 = new ArrayList<Long>(Arrays.asList(7463538934l, 4645372829l));
		ArrayList<Long> arr4 = new ArrayList<Long>(Arrays.asList(6747373831l, 7564738399l));
		ArrayList<Long> arr5 = new ArrayList<Long>(Arrays.asList(6574839284l, 9878684627l));
		ArrayList<Long> arr6 = new ArrayList<Long>(Arrays.asList(9087484743l, 9808764531l));

		HashMap<String, ArrayList<Long>> map = new HashMap<String, ArrayList<Long>>();
		map.put("Sudarshan", arr);
		map.put("Pavan", arr1);
		map.put("Utkarsha", arr2);
		map.put("Snehal", arr3);
		map.put("Yogesh", arr4);
		map.put("Suraj", arr5);
		map.put("Aadarsh", arr6);
		
		System.out.println("Original List : ");
		Set<Entry<String, ArrayList<Long>>> set = map.entrySet();
		Iterator<Entry<String, ArrayList<Long>>> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("----------------------------------------------------------");
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a name to delete a Number from PhoneList ");
		String str=sc.next();
		Set<String> keys=map.keySet();
			if(keys.contains(str)) {
				map.remove(str);
			}
			else
				System.out.println("User Not found");
	
			for(String s : keys) {
				System.out.println(s+" "+map.get(s));
			}
		System.out.println("---------------------------------------------------");
		System.out.println("Enter a name to show a Number from PhoneList ");
		String str1=sc.next();
			for(String s : keys) {
				if(s.contains(str1)) {
					System.out.println(s+" "+map.get(s));
				}
		}
		
		
		
sc.close();
	}

}
