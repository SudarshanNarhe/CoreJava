package com.TreeSet;

import java.util.TreeSet;

public class CompareTwoSet {

	public static void Compare(TreeSet<String> st, TreeSet<String>str) {
		
		if(st.size()==str.size())
		{
			int count=0;
			for(String x:st)
			{
				for(String y:str)
				{
					if(x.equals(y))
					{
						count++;
					}
				}
			}
		
		if(count==st.size())
			System.out.println("Two set are equal");
		else
			System.out.println("Two set are different");
		}
		else
		System.out.println("Two set are different");
			
		
	}
	
	public static void main(String[] args) {
		
		TreeSet<String> t=new TreeSet<>();
		t.add("Blue");
		t.add("Red");
		t.add("Purple");
		t.add("Brown");
		t.add("White");
		t.add("Yellow");
		
		TreeSet<String> t1=new TreeSet<>();
		t1.add("Blue");
		t1.add("Red");
		t1.add("Purple");
		t1.add("Brown");
		t1.add("White");
		t1.add("Yellow");
		
		System.out.println("The two set equals : "+t.equals(t1));
		Compare(t, t1);

	}

}
