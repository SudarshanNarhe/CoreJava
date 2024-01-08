package com.basic;

public class Frequency {

	public static void frequency(int num[])
	{
		int count;
		for(int i=0;i<num.length;i++)
		{	
			boolean ispresent = false;
			count=0;
			for (int j=0;j<num.length;j++)
			{
				if(num[i]==num[j])
				{
					ispresent=true;
					count++;
				}
			}
				
			if(ispresent)
			{
				boolean notpresent =true;
				
				for(int k=i-1;k>=0;k--)
				{
					if(num[i]==num[k])
					{
						notpresent=false;
						break;
					}	
				}
					if(notpresent)
					System.out.println("The "+num[i]+" repeats "+count+" times.");
			}
		}
	}
	
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,2,1,2,2};
		frequency(arr);
		
	}

}
