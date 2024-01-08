package com.diwali5;

/*Write a java program to create a deep copy for User object. 
Class User { int userid , String name , Phone p }   
Phone { int modelno , Screen s } 
Screen { int length , int width } */

class Screen implements Cloneable{
	
	int length;
	int width;
	
	public Screen() {}
	
	public Screen(int len, int width) {
		this.length=len;
		this.width=width;
	}
	public String toString() {
		return "Screen has Length : "+length+" And Width :"+width;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}

class Phone implements Cloneable{
	
	int modelNo;
	Screen s;
	
	public Phone() {}
	
	public Phone(int modelno, Screen s) {
		this.modelNo=modelno;
		this.s=s;	
	}
	
	public String toString() {
		return "Mobile has ModelNo : "+modelNo+" And "+s.toString();
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Phone p= (Phone) super.clone();
		p.s=(Screen) s.clone();
		return p;
	}
}

public class User implements Cloneable{

	int userID;
	String name;
	Phone p;
	
	public User() {}
	
	public User (int userID, String name, Phone p) {
		
		this.name=name;
		this.userID=userID;
		this.p=p;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Phone getP() {
		return p;
	}

	public void setP(Phone p) {
		this.p = p;
	}
	public String toString() {
		
		return "User ID : "+userID+"\nName : "+name+"\nPhone : "+p.toString();
	}
	public User clone()throws CloneNotSupportedException {
		
		User s=(User) super.clone();
		s.p=(Phone) p.clone();
		return s;
	}
	public static void main(String[] args) {
		
		Phone p = new Phone(1234,new Screen(12,5));
		User original = new User (101,"Pavan",p);
		
		
		try {
			
			User clone = original.clone();
			System.out.println("Original : "+original);
			System.out.println("Clone User : "+clone);
			System.out.println("--------------------------------------------");
			original.p.modelNo=7890;
			System.out.println("Original : "+original);
			System.out.println("Clone User : "+clone);
			System.out.println("--------------------------------------------");
			clone.name="Sudarshan";
			System.out.println("Original : "+original);
			System.out.println("Clone User : "+clone);
		}
		catch (CloneNotSupportedException e)
		{
			e.printStackTrace();
			
		}
		
		
	}
	
}
