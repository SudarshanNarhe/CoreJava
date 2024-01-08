package com.diwali3;

/*Write a program containing ‘Application’ class with common features like vesion,technologyUsed and behavior like createSetup.
This class features further used for ‘DesktopApplication’ and ‘WebApplication’ classes creation in same package . 
Also it is used for ‘MobileApplication’ class creation in different package.
Do appropriate utilization of super keyword in creation of respective class objects and show details of each.	
*/

public class Application {
	
	int version;
	String technologyUsed;
	
	public Application () {
		System.out.println("I am in Defualt const of Application");
	}
	public Application(int version, String tech) {
		System.out.println("I am in Para const of Application");
		this.version=version;
		this.technologyUsed=tech;
	}
	public void creatSetUp()
	{
		System.out.println("By using a Technology "+technologyUsed+" and its Version is : "+version);
	}
	public void setVersion(int ver) {
		this.version=ver;
	}
	public int getVersion() {
		return version;
	}
	public void setTechnology(String tech) {
		this.technologyUsed=tech;
	}
	public String getTechnology() {
		return technologyUsed;
	}
	
		
}
