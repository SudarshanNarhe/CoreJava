package com.jdbc1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoResultMetaData {
	
	public static void main(String[] args) {
		
		Connection con=null;
		Statement st=null;
		ResultSet rs = null;
		
		try {
			con= MyConnection.getMySQLConnection();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
