package com.basic;

public class ReverseOder {

	
	public static void main(String[] args) {
		
		String str = "How are you";
		
		String[] s= str.split(" ");	
//		for(String a : s)
//			System.out.println(a);
		int st = s.length;
		String []s1 =new String [s.length];
		
		for(int i=0;i<s.length;i++)
		{
			s1[st-1]=s[i];
			st--;
		}
		for(String b : s1)
			System.out.print(b+" ");
		
		// Reverse word in a String...
		String output="";
		for(int i=0;i<s.length;i++)
		{
			for(int k=s[i].length()-1;k>=0;k--)
			{
				output+=s[i].charAt(k);
			}
			output+=' ';
		}
		System.out.println("\n"+output);
		
		String output1="";
		for(int i=0;i<s1.length;i++)
		{
			for(int k=s1[i].length()-1;k>=0;k--)
			{
				output1+=s1[i].charAt(k);
			}
			output1+=' ';
		}
		System.out.println(output1);
		
		
		// Without Split method...
		int count =0;
		String str1="";
		for(int i=str.length()-1;i>=0;i--)
		{
			if(str.charAt(i)!=' ')
			{
				count =0;
				str1+=str.charAt(i);
			}
			if(str.charAt(i)==' ')
			{
				count++;
			}
			if(count==1)
			{
				str+=' ';
			}
		}
		System.out.println(str1);
		
	}

}
