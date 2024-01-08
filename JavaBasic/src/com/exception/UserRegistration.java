package com.exception;

import java.util.Scanner;

/*Include a method named registerUser that takes an email address as a parameter 
and performs the following validations:
The email address must not be null.
The email address must contain the "@" symbol.
The email address must have a valid domain (for simplicity,
 you can check if the domain contains a dot "." character).*/

public class UserRegistration {

	public void registerUser(String mail) throws EmailValidationException {
		
		if(mail.contains("@")&& mail.contains(".") && mail!=null) {
			System.out.println(mail);
		}
		else{
			throw new EmailValidationException(mail);
		}
		
//		char ch[]=mail.toCharArray();
//		for(int i=0;i<ch.length;i++) {
//			if(ch[i]!='@' || ch[i]!='.'){
//				throw new EmailValidationException(mail);
//			}	
//		}
//		System.out.println(mail);
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Email Address : ");
		String email=sc.next();
		
		UserRegistration obj = new UserRegistration();
		
		try {
			
			obj.registerUser(email);	
		} 
		catch (EmailValidationException e) {
			
			System.out.println(e);
		}
		
		
sc.close();		
	}
	
}
