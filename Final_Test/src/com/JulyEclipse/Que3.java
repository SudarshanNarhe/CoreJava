package com.JulyEclipse;

import java.util.ArrayList;
import java.util.HashMap;

/*Q3. Customer does online shopping to leverage Diwali offers.	 
 * Shopping list of Customers is maintained in following format:  
 * ArrayList<Item>.Each  Item has ID,name,price and qty.
From ArrayLsit of Items create a map <String,Integer> 
where Item Name is key and total quantity ordered for that Item as Value. 
Eg. Items in shpping list are : 
[(112,”ParleG”,20.00,10),(113,”GoodDay”,40.00,30), (112,”ParleG”,20.00,5),(113,”GoodDay”,40.00,10)]
Then Map would be like this :{{ParleG,15},{GoodDay,40}}			[2]
*/

public class Que3 {
	
	public static void main(String[] args) {
		
		ArrayList<Item> items= new ArrayList<Item>();
		items.add(new Item(101, "ParleG", 50, 20));
		items.add(new Item(130, "GoodDay", 60, 63));
		items.add(new Item(192, "ParleG", 30, 21));
		items.add(new Item(120, "Tiger", 23, 32));
		items.add(new Item(104, "ParleG", 80, 41));
		items.add(new Item(110, "Tiger", 80, 19));
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for(Item item : items) {
			
			if(map.containsKey(item.name)) {
				map.put(item.name, map.get(item.name)+item.qnty);
			}
			else
				map.put(item.name, item.qnty);
			
		}
		
		System.out.println(map);
		
	}
	
};

class Item{
	
	int id;
	String name;
	double price;
	int qnty;
	
	public Item() {


		
	}

	public Item(int id, String name, double price, int qnty) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.qnty = qnty;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQnty() {
		return qnty;
	}

	public void setQnty(int qnty) {
		this.qnty = qnty;
	}

	@Override
	public String toString() {
		return "\nItem [id=" + id + ", name=" + name + ", price=" + price + ", qnty=" + qnty + "]";
	}
	
	
	
}
