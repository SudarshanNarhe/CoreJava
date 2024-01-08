package com.jdbc1;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;


public class DemoDatabaseMetaData {
	
	public static void main(String[] args) {
		
		Connection con=null;
		
		try {
			con=MyConnection.getMySQLConnection();
			System.out.println("Connected...");
			System.out.println("-----------DatabaseMetaData--------------");
			DatabaseMetaData bdms= con.getMetaData();
			System.out.println("\nDatabase product name : " + bdms.getDatabaseProductName());
			System.out.println("\nDatabase product version : " + bdms.getDatabaseProductVersion());
			System.out.println("\nDriver name : " + bdms.getDriverName());
			System.out.println("\nDriver version : " + bdms.getDriverVersion());
			System.out.println("\nUSer name : " + bdms.getUserName());
			System.out.println("\nkeywords "+bdms.getSQLKeywords());
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
