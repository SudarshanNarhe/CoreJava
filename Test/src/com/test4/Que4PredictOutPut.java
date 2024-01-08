package com.test4;

public class Que4PredictOutPut {

	public static void main(String[] args) {

		String []s1 = {"ONE","TWO","THREE","FOUR"};
		String []s2 = {"THREE","TWO",new String("ONE")};
		
		System.out.println(s1[0]==s2[2]);
		System.out.println(s1[1]==s2[1]);
		System.out.println(s1[2]==s2[0]);
		
		
		String str=new String("xyz");
		String str1="abc";
		str1=str+str1;
		
		System.out.println(str1);
		
		String x="abc";
		x.toUpperCase();
		System.out.println(x);
		String y=x.replace('B', 'b');
		y=y+"xyz";
		System.out.println(y);
		
		//Both hashCode are Diff so they are Immutable...
		String str3="Sudarshan";
		System.out.println(str3.hashCode());
		
		str3=str3.concat("Narhe");
		System.out.println(str3.hashCode());
	
		
	}

}
