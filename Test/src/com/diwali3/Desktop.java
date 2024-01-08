package com.diwali3;

public class Desktop extends Application{

	public Desktop() {
		System.out.println("I am in Defualt const of Desktop");
	}
	public Desktop(int version, String tech) {
		super(version,tech);
		System.out.println("I am in Para const of Desktop");
		
	}
	@Override
	public void creatSetUp() {
		System.out.println("The Desktop Application is Created ");super.creatSetUp();
	}
	
	public static void main(String []args) {
		
		Desktop d= new Desktop(11, "Java");
		d.creatSetUp();
	}
	
}
