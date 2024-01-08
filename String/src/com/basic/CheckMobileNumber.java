package com.basic;

import java.util.Arrays;

//Check entered String is valid mobile number.

public class CheckMobileNumber {

	public static void main(String[] args) {
		
		String str="9788628323";
		System.out.println(str);
		char ch[]=str.toCharArray();
		System.out.println(Arrays.toString(ch));
		
		int count=0;
		
			for(int i=0;i<ch.length;i++)
			{
				for(int j=48;j<58;j++)
				if(ch[i]==j)
				{ 
					count++;
				}
			}
		
		if(count==10)	
		System.out.println("Its a Valid Mobile Number.");
		else
			System.out.println("Not a valid Mobile Number.");
		
		
	}

}
