package com.basic;

public class AllOccuranceOfChar {

	public static void main(String[] args) {
		
		String str = "Aadarsh is a boy";
		System.out.println(str);
		 char ch[]=str.toCharArray();
		 int count=0;
		for(int i=0;i<ch.length;i++)
		{
			count =1;
			if(ch[i]!=' ')
			{
				for(int j=i+1;j<ch.length;j++)
				{
					if(ch[i]==ch[j])
					{
						count++;
						ch[j]=' ';
					}
				}
			}
			if(ch[i]!=' ')
				System.out.println("Number of Occurances of : "+ch[i]+" is "+count);
		}
		
			
	
	}

}
