package com.jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Country_Names {

	public static Connection getMyConnection() throws ClassNotFoundException, SQLException {
		
		Connection con = null;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testcoursedb?autoReconnect=true&useSSL=false","root","root");
		
		return con;
	}
	public static void getCountryNames() throws ClassNotFoundException, SQLException {
		
		Connection con = getMyConnection();
		String sql = "select country_name from countries";
		Statement st=con.createStatement();
		ResultSet set =st.executeQuery(sql);
		int count=0;
		while(set.next()) {
			System.out.println(set.getString(1));
			count++;
		}
		System.out.println(count+" rows affected");
	}
	public static void main(String[] args) {
		
		try {
			getCountryNames();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
