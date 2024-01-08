package com.diwali5;

import java.util.Scanner;

/*Create a hardcoded array of user objects. User { String username , String passwd } . 
Ask user to enter username and password. Find out username and password entered by user are valid or not. 
If username and password exists in array then its valid , otherwise not. Display appropriate message*/

public class User2 {

	String username;
	String password;
	
	public User2() { }
	
	public User2(String username, String pass) {
		
		this.username=username;
		this.password=pass;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public static void main(String[] args) {
		
		User2 []data= new User2[5];
		data[0]=new User2("user1","User@123");
		data[1]= new User2("user2","User#121");
		data[2]= new User2("user3","User@567");
		data[3]= new User2("user4","User.222");
		data[4]= new User2("user5","User_432");
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Username : ");
		String user =sc.next();
		System.out.println("Enter Password");
		String pass = sc.next();
		boolean check = false;
		for(int i=0;i<data.length;i++) {
			
				if(data[i].getUsername().equals(user) && data[i].getPassword().equals(pass)) {
					check=true;
					System.out.println("Username : "+data[i].username+" Password : "+data[i].password);
				}
				else if(pass.length()<8 || pass.length()>8) {
					System.out.println("Password must be 8 characters long");
					break;
				}
				else if(pass.charAt(i)==' ') {
					System.out.println("Password not have a space");
					break;	
				}
				
		}
		if(check) { }
		
		else {
			System.out.println("Invalid Input...");
		}
		
sc.close();
	}
	
}
