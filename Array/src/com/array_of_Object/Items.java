package com.array_of_Object;

/* Item class contains itemId,ItemName,itemCost.
1.Create Array of Item with size 5 and display it.     
2. Show itemNames with cost more than Rs.2000      
3. Show item details with higest price.      
4. Show average price of all items.       
5. Increase the itemPrice by 200 whose itemPrice is below Rs.1000  */    

public class Items {

	private int itemID;
	private String itemName;
	private double itemCost;
	
	public Items()
	{
		//default
	}
	public Items(int id, String name, double cost)
	{
		this.itemID=id;
		this.itemName=name;
		this.itemCost=cost;
	}
	
	public int getItemID() {
		return itemID;
	}
	public void setItemID(int itemID) {
		this.itemID = itemID;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getItemCost() {
		return itemCost;
	}
	public void setItemCost(double itemCost) {
		this.itemCost = itemCost;
	}
	
	@Override
	public String toString() {
		return "Items [itemID=" + itemID + ", itemName=" + itemName + ", itemCost=" + itemCost + "]";
	}

}
