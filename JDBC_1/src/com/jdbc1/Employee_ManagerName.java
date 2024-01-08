package com.jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Employee_ManagerName {
	
	// WAP using JDBC to select and print employee names along with their manager names.
	
	public static Connection getMyConnection () throws ClassNotFoundException, SQLException {
	
		Connection con = null;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testcoursedb?autoReconnect=true&useSSL=false","root","root");
		
		return con;
		
	}
	public static void employeeAndManagerName() throws ClassNotFoundException, SQLException {
		
		Connection con = getMyConnection();
		String sql="select e.first_name as EmployeeName ,e1.first_name as ManagerName "
				+ " from employees e"
				+ " INNER join employees e1 on e.manager_id=e1.employee_id";
		
		Statement str=con.createStatement();
		ResultSet set=str.executeQuery(sql);

		while(set.next()) {
			System.out.println(set.getString(1));
			System.out.println(set.getString(2));
			System.out.println();
		}
	}
	public static void main(String[] args) {
		
		try {
			employeeAndManagerName();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
