package com.jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteEmployeesBySal {
	
	//WAP using JDBC to delete employees if their salaries are equal to 0.
	
	public static Connection getMyConnection() throws ClassNotFoundException, SQLException {
		
		Connection con = null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testcoursedb?autoReconnect=true&useSSL=false","root","root");
		
		return con;
		
	}
	public static void deleteEmployees() throws ClassNotFoundException, SQLException {
		
		Connection con = getMyConnection();
		String sql = "Delete from employees "
				+ " where salary = ?";
		PreparedStatement prst=con.prepareCall(sql);
		prst.setDouble(1,0);
		int rows =prst.executeUpdate();
		System.out.println(rows +" rows are affected");
		
	}
	public static void main(String[] args) {
		
		try {
			deleteEmployees();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
