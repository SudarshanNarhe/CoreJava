package com.containment;

public class Person {
	//name, gender, age, Address).
	private String name;
	private String gender;
	private int age;
	private Address address;
	
	public Person()
	{
		
	}
	public Person(String name,String gender, int age, Address address)
	{
		this.name=name;
		this.gender=gender;
		this.age=age;
		this.address=address;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setGender(String gender)
	{
		this.gender=gender;
	}
	public String getGender()
	{
		return gender;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public int getAge()
	{
		return age;
	}
	public void setAddress(Address address)
	{
		this.address=address;
	}
	public Address getAddress()
	{
		return address;
	}
	public String toString()
	{
		return "Name : "+name+"\nGender : "+gender+"\nAge : "+age+"\n"+address;
	}
	
	public static void main(String[] args) {
		
		Address ad=new Address("Pune","Maharashtra","India");
		Person obj= new Person("Sudarshan","Male",23,ad);
		System.out.println(obj);
		
	}

}
