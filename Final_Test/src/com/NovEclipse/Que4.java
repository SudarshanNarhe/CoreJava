package com.NovEclipse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

/*Q4. Hotel serves delicious Menus to its Customers. It maintains list of Orders given on daily basis. 
 * Order list is maintained as ArrayList<Order>. Each Order contains orderid, MenuName, price,  qtyOrdered. 
 * (Price of same Menu may vary according hours).
From ArrayLsit of Orders create a map <String,Float> where Menu Name is key and total sale in a day for the Menu as Value. 
(sale for the menu is Price*qty ordered).Eg. Order List for a day is :
[(80,”Pav Bhajee”,120.00,5),	(90,”Grilled Sandwitch”,72.00,10), 		(92,”Hakka Noodles”,220.00,2),	
(96,”Pav Bhajee”,125.00,8),        (101,”Grilled Sandwitch”,70.00,2)]
Then Map would be like this :
{{“Pav Bhajee”,(120*5)+(125*8) ie.1600},   {“Hakka Noodles”, 440}, {“Grilled Sandwitch”,860}}	      */

public class Que4 {
	
	
	public static void main(String[] args) {
		
		ArrayList<Order> orders= new ArrayList<Order>();
		orders.add(new Order(10, "Pav Bhajee", 120, 5));
		orders.add(new Order(90, "Grilled Sandwitch", 80, 8));
		orders.add(new Order(36, "Hakka Noodles", 360, 4));
		orders.add(new Order(23, "Pav Bhajee", 135, 9));
		orders.add(new Order(67, "Hakka Noodles", 345, 6));
		
		HashMap<String, Float> map = new HashMap<String, Float>();
		
		
		for (int i=0;i<orders.size();i++) {
			
			Float sale=0f;
			for(int j=0;j<orders.size();j++) {
				if (orders.get(i).MenuName.equals(orders.get(j).MenuName) && i > j) {
					break;

				}
				if (orders.get(i).MenuName.equals(orders.get(j).MenuName)) {
					sale = sale + orders.get(j).price * orders.get(j).quntityordered;
				}
			}
			if (sale != 0) {
				map.put(orders.get(i).MenuName, sale);
			}
		}
	
		Iterator<Entry<String, Float>> entry= map.entrySet().iterator();
		while(entry.hasNext()) {
			Entry<String, Float> en= entry.next();
			System.out.println(en.getKey()+" -->> "+en.getValue());
		}
		
	}
	
};

class Order {
	
	int orderid;
	String MenuName;
	float price;
	int quntityordered;
	
	public Order() {
		
	
	}

	public Order(int orderid, String menuname, float price, int quntityordered) {
		
		this.orderid = orderid;
		MenuName = menuname;
		this.price = price;
		this.quntityordered = quntityordered;
	}

	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

	public String getMenuname() {
		return MenuName;
	}

	public void setMenuname(String menuname) {
		MenuName = menuname;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getQuntityordered() {
		return quntityordered;
	}

	public void setQuntityordered(int quntityordered) {
		this.quntityordered = quntityordered;
	}

	@Override
	public String toString() {
		return "\nOrder [orderid=" + orderid + ", Menuname=" + MenuName + ", price=" + price + ", quntityordered="
				+ quntityordered + "]";
	}
	
	
	
}
