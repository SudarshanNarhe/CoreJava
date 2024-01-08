package com.array_of_Object;

import java.util.Arrays;

/*  
 * Supplier class Contains supid,supName and array of itemsSUpplied.
 * Item class contains itemId,ItemName,itemCost.
 * 1Create 2 Item type arrays with size 5 and associate them with two Supplier objects. 
   2.Show item details supplied by each supplier. */

public class Supplier {
	
	int supid;
	String supName;
	Items itemSupplied[];
	
	public Supplier()
	{
		//default
	}
	public Supplier(int supid, String supname, Items itemSupplied[])
	{
		this.itemSupplied=itemSupplied;
		this.supid=supid;
		this.supName=supname;
	}
	
	
	public int getSupid() {
		return supid;
	}
	public void setSupid(int supid) {
		this.supid = supid;
	}
	public String getSupName() {
		return supName;
	}
	public void setSupName(String supName) {
		this.supName = supName;
	}
	public Items[] getItemSupplied() {
		return itemSupplied;
	}
	public void setItemSupplied(Items[] itemSupplied) {
		this.itemSupplied = itemSupplied;
	}
	
	@Override
	public String toString() {
		return "Supplier Id : "+supid+"\nSupplier Name : "+supName+"\nItems Supplied : "+(Arrays.toString(itemSupplied));
	}
	public static void main(String[] args) {
		
		Items item[]= new Items[5];
		item[0]=new Items(102,"Pen",500);
		item[1]=new Items(103,"Book",3000);
		item[2]=new Items(104,"Bag",2500);
		item[3]=new Items(105,"Bottle",700);
		item[4]=new Items(106,"Table",15000);
		
		Items item1[]= new Items[5];
		item1[0]=new Items(202,"Laptop",50000);
		item1[1]=new Items(203,"Airbuds",3500);
		item1[2]=new Items(204,"Fan",5500);
		item1[3]=new Items(205,"Watch",4500);
		item1[4]=new Items(206,"Mobile",15000);
		
		Supplier sup = new Supplier(1,"Maruti",item);
		Supplier sup1 = new Supplier(2, "Aadarsh", item1);
		
		System.out.println(sup);
		System.out.println(sup1);
		
		

	}

}
