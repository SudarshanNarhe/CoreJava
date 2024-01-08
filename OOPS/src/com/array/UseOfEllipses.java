package com.array;

public class UseOfEllipses {
	int sum=0;
	int multi=1;;
	public int add(int...n)
	{
		
		for(int i:n)
		{	
			sum+=i;
		}
		return sum;
	}
	public long multi(int...n)
	{
		for(int i:n)
		{
			multi=multi*i;
		}
		return multi;
	}
	public String toString()
	{
		return "Sum is : "+sum+" ; Multiplication is : "+multi;
	}
	
	public static void main(String[] args) {
		
		UseOfEllipses obj=new UseOfEllipses();
		obj.add(1,2,3,4,5);
		obj.multi(1,2,3,4,5);
		System.out.println(obj);
		
	}

}
