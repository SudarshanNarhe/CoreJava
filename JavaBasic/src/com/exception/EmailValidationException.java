package com.exception;

/*EmailValidationException Class:

Create a custom exception class named EmailValidationException that extends the Exception 
class.
This exception should be thrown whenever an invalid email address is detected 
during the registration process.*/

public class EmailValidationException extends Exception{

	String mail;
	
	public EmailValidationException() {
		
	}
	public EmailValidationException(String mail) {
		this.mail=mail;
	}
	@Override
	public String toString() {
		return "Invalid Email Address is detected...";
	}
	
}
