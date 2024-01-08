package com.AprilWritten;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

/*19) suppose  email id contains  email_alias with number 
 * then create Map which Store alias as key and number as value.e.g email is xyz12@gmail.com 
 * then map will be
m.put(xyz,12). suppose email is amit@yahoo.com then map will be
m.put(amit,0); 
*/

public class Que18 {
	
	public static void main(String[] args) {
		
		String mail1= "sudarshan123@gmail.com";
		String mail2= "yogesh45@gmail.com";
		String mail3= "pavan@gmail.com";
		String mail4= "aadaarsh50@yahoo.com";
		String mail5= "ishwar890@hotmail.com";
		String mail6= "suraj@yahoo.com";
		
		ArrayList<String> mail = new ArrayList<String>();
		mail.add(mail1);
		mail.add(mail2);
		mail.add(mail3);
		mail.add(mail4);
		mail.add(mail5);
		mail.add(mail6);
		
		System.out.println(mail);
		HashMap<String, String> map= new HashMap<String, String>();
		
		Iterator<String> itr= mail.iterator();
		while(itr.hasNext()) {
			String str= itr.next();
			String str1="@";
			int index=0;
			index=str.indexOf(str1);
			String str2=str.substring(0, index);
			System.out.println(str2);
			String strval="";
			String strkey="";
			char [] ch = str2.toCharArray();
			for(char a : ch) {
				if (a >= 48 && a <= 57) {
					strval = strval + a;
				}
				if(a>=97 && a<=122) {
					strkey = strkey + a;
				}
				
			}
			map.put(strkey, strval);
			if(map.containsValue("")) {
				map.put(strkey, "0");
			}
			
			
		}
		
		Iterator<Entry<String, String >> mapitr= map.entrySet().iterator();
		while(mapitr.hasNext()) {
			Entry<String, String > entry=mapitr.next();
			System.out.println("Key : "+entry.getKey()+" , "+"Value : "+entry.getValue());
		}
		
	}
	
}
