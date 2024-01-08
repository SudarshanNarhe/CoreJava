package com.diwali3;

public class WebApp extends Application{

	public WebApp() {
		System.out.println("I am in Defualt const of WebApp");
	}
	public WebApp(int version, String tech) {
		
		super(version, tech);
		System.out.println("I am in Para const of WebApp");
	}
	@Override
	public void creatSetUp() {
		System.out.println("The Web Application is Created ");super.creatSetUp();
	}
	
	public static void main(String[] args) {
		
		WebApp w = new WebApp(3, "Python");
		w.creatSetUp();
		//WebApp w1 = new WebApp();
		
	}

}
