package com.test5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MovieArrayList {

	public static void main(String[] args) {
		
		List<String> l1= Arrays.asList("Amitabh Bacchan", "Ranvir Kapoor", "Ranvir Singh","Deepika");
		List<String> l2= Arrays.asList("Sanjay Datt", "Vicky Kaushal","Salman Khan ", "Shahruk Khan");
		List<String> l3= Arrays.asList("Sharddha Kapoor", "Amitabh Bacchan", "Aishwayra Ray", "Nora Fatehi");
		List<String> l4= Arrays.asList("Pankaj Tripathi, Bhau Kadam, Parshya, Archana Patil, Samir Chaughule");
		
		ArrayList<Movie> movie= new ArrayList<Movie>();
		movie.add(new Movie(102, "Jaan", l1));
		movie.add(new Movie(302,"Border4",l2));
		movie.add(new Movie(546, "Family", l3));
		movie.add(new Movie(129, "Sairat", l4));
		
		
		Iterator<Movie> itr= movie.iterator();
		int count=0;
		while(itr.hasNext()) {
			Movie m = itr.next();
			if(m.getActor().contains("Amitabh Bacchan")) {
				count++;
			}
		}
		System.out.println("In "+count+" Movies Amitabh Bacchan is acted");

	}

}
