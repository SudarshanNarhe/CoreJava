package com.methods;

public class CountCustomers {

	static int count =1;
	private String buyProduct;
	
	CountCustomers()
	{
		count++;
		System.out.println("The number of customers are : "+count);
		
	}
	public void setBuyProduct(String buyprd)
	{
		buyProduct=buyprd;
	}
	public String getBuyProduct()
	{
		return buyProduct;
	}
	public void display()
	{
		System.out.println(buyProduct);
	}
	
	public static void main(String[] args) {
		
		CountCustomers obj=new CountCustomers();
		obj.setBuyProduct("sugar,rice");
		obj.setBuyProduct("Biscuits,sugar, maida");
	}

}
