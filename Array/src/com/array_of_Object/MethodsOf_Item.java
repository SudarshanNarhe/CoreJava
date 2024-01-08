package com.array_of_Object;

/* Item class contains itemId,ItemName,itemCost.
1.Create Array of Item with size 5 and display it.     
2. Show itemNames with cost more than Rs.2000      
3. Show item details with higest price.      
4. Show average price of all items.       
5. Increase the itemPrice by 200 whose itemPrice is below Rs.1000  */    

public class MethodsOf_Item {
	
	
	public static void compare(Items item[])
	{	
		System.out.println("The Items having more than 2000 cost are : ");
		for(int i=0;i<item.length;i++)
		{
		  if(item[i].getItemCost()>2000)
		  {
			  System.out.println(item[i].getItemName());
		  }
		}
	}
	public static void highestPrice(Items item[])
	{
		System.out.println("The higher cost item is : ");
		Items higherCost= item[0];
		for(int i=0;i<item.length;i++)
		{
			if(item[i].getItemCost()>higherCost.getItemCost())
			{
				higherCost=item[i];
			}
		}
		System.out.println(higherCost);
	}
	public static double calAvegare(Items item[])
	{
		double totalcost=0;
		for(Items items : item)
		{
			totalcost = totalcost+items.getItemCost();
		}
		double avg= totalcost/item.length;
		return avg;
	}
	public static void showAverage(Items item[])
	{
		System.out.println("\nAverage Price of all Items is : "+calAvegare(item));
	}
	public static void add200(Items item[])
	{
		System.out.println("The item cost after adding 200 is : ");
		for(int i=0;i<item.length;i++)
		{
			if(item[i].getItemCost()<1000)
			{
			double	itemcost = item[i].getItemCost()+200;
			item[i].setItemCost(itemcost);
			System.out.println(itemcost);
			}
		}
		
	}
	
		 @Override 
		 public String toString() { 
		  return "ItemDetails []"; 
		 } 
		 
		 public static void main(String[] args) {
				
				Items item[]= new Items[5];
				item[0]=new Items(102,"Pen",500);
				item[1]=new Items(103,"Book",3000);
				item[2]=new Items(104,"Bag",2500);
				item[3]=new Items(105,"Watch",4500);
				item[4]=new Items(106,"Mobile",15000);
				
				for(int i=0;i<item.length;i++)
				{
					System.out.println(item[i]);
				}
				System.out.println("______________________________________________________");
				compare(item);
				System.out.println("____________________________________________________");
				highestPrice(item);
				System.out.println("_____________________________________________________");
				showAverage(item);
				System.out.println("_____________________________________________________");
				add200(item);
				
		 }

}
