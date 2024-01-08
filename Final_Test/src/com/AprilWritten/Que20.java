package com.AprilWritten;

import java.util.Comparator;
import java.util.TreeSet;

/*20) There is a collection with a page name and the number of times that page has been viewed. 
 * We need to print the names of the pages in descending order of pagename length .
if page length is same then print in ascending order of alphabets.[1M]
e.g. pagename sky,page,maze,laptop
output- laptop,maze,page,sky
*/

class Page{
	
	String pagename;
	int view;
	
	public Page() {
	
		
	}

	public Page(String pagename, int view) {
		super();
		this.pagename = pagename;
		this.view = view;
	}

	@Override
	public String toString() {
		return "\nPage [pagename=" + pagename + ", view=" + view + "]";
	}	
	
};

class ComparebyNameLength implements Comparator<Page>{

	@Override
	public int compare(Page o1, Page o2) {
		if(o1.pagename.length()>o2.pagename.length())
			return -1;
		else if (o1.pagename.length()<o2.pagename.length()) {
			return 1;
		}
		else
		return o1.pagename.compareToIgnoreCase(o2.pagename);
				//compareTo(o2.pagename);
	}
	
}

public class Que20 {
	
	public static void main(String[] args) {
		
		Page p1 = new Page("Laptop", 20);
		Page p2 = new Page("Sky", 27);
		Page p3 = new Page("Page",30);
		Page p4 = new Page("maze",18);
		Page p5 = new Page("All",50);
		
		TreeSet<Page> pset = new TreeSet<Page>(new ComparebyNameLength());
		pset.add(p1);
		pset.add(p2);
		pset.add(p3);
		pset.add(p4);
		pset.add(p5);
		
		System.out.println(pset);
	}
	
};
