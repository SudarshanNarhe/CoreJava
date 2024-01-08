package com.test3;

import java.util.Arrays;

/*Write a java program to create a array of 3 person .Take input or hardcode  for all  three person from console. Person class is as follows 
Person (int id, String name, Vehicle v[] )
Vehicle (int vid, String vname) */


public class Person {
	
	int pid;
	String pname;
	Vehicle v[];
	
	public Person()
	{
		
	}
	public Person(int id, String name, Vehicle v[])
	{
		pid=id;
		pname=name;
		this.v=v;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", v=" + Arrays.toString(v) + "]";
	}
	
	public static void main(String[] args) {
		
		Vehicle v[]= new Vehicle[2];
		v[0]=new Vehicle(102,"Bike");
		v[1]=new Vehicle(105,"Car");
		
		Vehicle v1[]= new Vehicle[2];
		v1[0]=new Vehicle(111,"Cycle");
		v1[1]=new Vehicle(121,"Car");
		
		Vehicle v2[]= new Vehicle[2];
		v2[0]=new Vehicle(102,"Bike");
		v2[1]=new Vehicle(105,"Auto");
		
		Person p[]=new Person[3];
		p[0]= new Person(1,"Sk",v);
		p[1]= new Person(2,"PK",v1);
		p[2]= new Person(3,"RD",v2);
		
		for(int i=0;i<p.length;i++)
		{
			System.out.println(p[i]);
		}
		
	}
	
}


class Vehicle
{
	int vid;
	String name;
	
	public Vehicle()
	{
		
	}
	public Vehicle(int id, String name)
	{
		vid=id;
		this.name=name;
	}
	@Override
	public String toString() {
		return "Vehicle [vid=" + vid + ", name=" + name + "]";
	}
	
	
	
	
}