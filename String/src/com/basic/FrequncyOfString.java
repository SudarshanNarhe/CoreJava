package com.basic;

import java.util.Arrays;

//Write a Java program to find highest frequency character in a string.
//Write a Java program to find lowest frequency character in a string.

public class FrequncyOfString {

	public static void main(String[] args) {
		
		String str ="Susdarshanaaaa";
		
		char ch[]=str.toCharArray();
		System.out.println(Arrays.toString(ch));
		int a=0;
		int b=0;
		int max=0;
		int min=ch[0];
		char temp='s';
		char temp1='d';
		for(int i=0;i<ch.length;i++)
		{	
			int count=0;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
				}
			}
			if (count !=0)
			{
				boolean notOccured = true;
				for(int k=i-1;k>=0;k--)
				{
					if(ch[i]==ch[k])
						notOccured=false;
				}
				if(notOccured)
				{
					System.out.println("Character "+ch[i]+" : "+(count+1));
					
					a=(count+1);
					b=(count+1);
				
					if(a>max) {
						max=a;
					temp=ch[i];
					}
					if(b<min) {
						min=b;
						temp1=ch[i];
					}
				}
			}
		}
		System.out.println("Character "+temp+" Max Frequncy "+max);
		System.out.println("Character "+temp1+" Min Frequency "+min);
	}

}
