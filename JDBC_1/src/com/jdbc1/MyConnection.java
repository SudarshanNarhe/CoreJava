package com.jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {

	public static Connection getMySQLConnection() throws ClassNotFoundException, SQLException
	{
		Connection con = null;
		
		//Load the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// get the connection
		con= DriverManager.getConnection
		("jdbc:mysql://localhost:3306/testcoursedb?autoReconnect=true&useSSL=false","root","root");
		return con;
	}
	
}
