package com.array;

public class ReverseOrder {

	public void arrayCreation()
	{
	int arr[]= {1,2,3,4,5,6};
	this.showArrayElement(arr);
	}
	public void showArrayElement(int obj[])
	{
		for(int i=obj.length-1;i>=0;i--)
		{
			System.out.println(obj[i]);
		}
	}
	
	public static void main(String[] args) {
		
		ReverseOrder bjp= new ReverseOrder();
		bjp.arrayCreation();
		
	}

}
