package com.basic;

import java.util.Arrays;

//Write a Java program to concatenate two strings.

public class Concatation {

	public static void main(String[] args) {
		
		String s="Sudarshan ";
		String s1="Narhe";
		
		//1
		System.out.println("By String : "+s.concat(s1));
		
		//2
		String s3= s+s1;
		System.out.println("By Addition : "+s3);
		
		//3
		
		char []ch = s.toCharArray();
		char []ch1 =s1.toCharArray();
		int a = ch.length;
		int b = ch1.length;
		char []ch2 = new char [a+b];
		
		System.out.print("By Merge Method : ");
		
		for(int i=0;i<a;i++)
		{
			ch2[i]=ch[i];
		}
		for(int i=0;i<b;i++)
		{
			ch2[a+i]=ch1[i];
		}
		
		for(int i=0;i<ch2.length;i++)
		{
			System.out.print(ch2[i]);
		}
		
		System.out.print("\nBy Merge Adjacent Method Using Count : ");
		
		int count =0;
		if(a>b)
		for(int i=0;i<ch.length;i++)
		{	
				if(i<ch.length)
				ch2[count++]=ch[i];
				if(i<ch1.length)
				ch2[count++]=ch1[i];
	
		}
		if(b>a)
			for(int i=0;i<ch1.length;i++)
			{	
					if(i<ch.length)
					ch2[count++]=ch[i];
					if(i<ch1.length)
					ch2[count++]=ch1[i];
		
			}
		
		for(int i=0;i<ch2.length;i++)
		{
			System.out.print((ch2[i]));
		}
		
		//4
		
		System.out.print("\nBy Array Copy Method : ");
		char []ch3 = s.toCharArray();
		char []ch4 =s1.toCharArray();
		char []ch5 = new char [ch3.length+ch4.length];
		
		System.arraycopy(ch3, 0, ch5, 0, ch3.length);
		System.arraycopy(ch4, 0, ch5, ch3.length, ch4.length);
		
		System.out.println(Arrays.toString(ch5));
		
		
	}

}
