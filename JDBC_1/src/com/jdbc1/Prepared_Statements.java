package com.jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Prepared_Statements {
	
	public static Connection getMyConnection() throws ClassNotFoundException, SQLException {
		
		Connection con = null;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testcoursedb?autoReconnect=true&useSSL=false","root","root");
		
		return con;
		
	}
	public static void checkSalary() {
		try {
			Connection con = getMyConnection();
			String str = "select employee_id,Salary from employees where salary > ?";
			PreparedStatement pst=con.prepareCall(str);
			pst.setDouble(1, 30000);
			ResultSet rs=pst.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1));
				System.out.println(rs.getDouble(2));
				System.out.println("____________________________________");
			}
			System.out.println("**********************************");
			// for 2 same query can be use
			pst.setDouble(1, 50000);
			rs=pst.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1));
				System.out.println(rs.getDouble(2));
				System.out.println("____________________________________");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void checkSalByInput() throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a salary : ");
		Double sal = sc.nextDouble();
		Connection con =getMyConnection();
		String sql = "select employee_id,salary from employees where salary > ?";
		PreparedStatement pst=con.prepareCall(sql);
		pst.setDouble(1, sal);
		ResultSet rs =pst.executeQuery();
		while(rs.next()) {
		System.out.println(rs.getInt(1));
		System.out.println(rs.getDouble(2));
		System.out.println("-------------------------------");
		}
		sc.close();
	}
	public static void insertValues() throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter new Employee ID : ");
		int id = sc.nextInt();
		System.out.println("Enter first name : ");
		String fname= sc.next();
		System.out.println("Enter a Last Name : ");
		String lname = sc.next();
		System.out.println("Enter a Salary : ");
		Double sal = sc.nextDouble();
		
		Connection con = getMyConnection();
		String sql = "insert into Employees (employee_id,first_name,last_name,salary) values(?,?,?,?)";
		PreparedStatement pr=con.prepareCall(sql);
		pr.setInt(1, id);
		pr.setString(2, fname);
		pr.setString(3, lname);
		pr.setDouble(4, sal);
		int rows =pr.executeUpdate();
		System.out.println(rows +" rows affeted");
		
		sc.close();
	}
	public static void main(String[] args) {
		
		//checkSalary();
		
		try {
			//checkSalByInput();
			insertValues();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
