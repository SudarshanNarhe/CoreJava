package com.exception;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;



class Parent {
	
	public void show()throws IOException,SQLException, NullPointerException{
		
		System.out.println("I am in Parent");
	}
	
}

public class Child extends Parent{
//NullPointer is unchecked so it is handled by main	
	@Override
	public void show() throws IOException, FileNotFoundException, SQLException {
		super.show();
	}
	public static void main(String[] args) {
		
		
	}
	
}
