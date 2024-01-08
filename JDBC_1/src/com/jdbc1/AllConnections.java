package com.jdbc1;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class AllConnections {
	
	public static Connection getSQLMyConnection() throws ClassNotFoundException, SQLException {
		
		Connection con=null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testcoursedb?autoReconnect=true&useSSL=false","root","root");
		return con;
		
	}
	public static Connection getSQLConnectionByDriverInterface() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		
		Connection con=null;
		Driver d = (Driver) Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		Properties obj= new Properties();
		obj.put("user", "root");
		obj.put("password", "root");
		con=d.connect("jdbc:mysql://localhost:3306/testcourse?autoReconnect=true&useSSL=false", obj);
		return con;
		
	}
	public static Connection getConnectionByFile() throws IOException, ClassNotFoundException, SQLException {
		Connection con=null;
		FileInputStream fin= new FileInputStream(".//src//mydatabse.properties");
		Properties p = new Properties();
		p.load(fin);
		String d= p.getProperty("driver");
		String url=p.getProperty("url");
		String u=p.getProperty("user");
		String pass=p.getProperty("password");
		
		Class.forName(d);
		
		//step-2
		 con = DriverManager.getConnection(url, u,pass);
		
		return con;
	}

}
