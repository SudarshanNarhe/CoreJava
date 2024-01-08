package com.jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetScrollingDemo {
	
	Connection con;
	Statement st;
	ResultSet rs;
	String sql;
	
	public ResultSetScrollingDemo () throws ClassNotFoundException, SQLException {
		
		con=getMyconnection();
		st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
		sql="select employee_id,first_name,last_name,salary,department_id "
				+ " from employees limit 10";
		rs=st.executeQuery(sql);
	}
	
	public static Connection getMyconnection() throws ClassNotFoundException, SQLException {
		
		Connection con = null;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testcoursedb?autoReconnect=true&useSSL=false","root","root");
		
		return con;
		
	}
	
	public void showScrollingDataInForward() throws SQLException {
		
		System.out.println("____________________________________________________________________________________");
		System.out.println("Emp ID" +"\t"+"First_Name"+"\t"+"Last_Name"+"\t"+"Salary"+"\t\tDept No");
		System.out.println("__________________________________________________________________________________");
		
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t\t"+rs.getString(3)+"\t\t"+rs.getDouble(4)+"\t\t"+rs.getInt(5));
		}
		
	}
	
	public void showScrollingDataInReverse() throws SQLException {
		
		System.out.println("\nReverse Order : ");
		
		System.out.println("____________________________________________________________________________________");
		System.out.println("Emp ID" +"\t"+"First_Name"+"\t"+"Last_Name"+"\t"+"Salary"+"\t\tDept No");
		System.out.println("__________________________________________________________________________________");
		
		while(rs.previous()) {
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t\t"+rs.getString(3)+"\t\t"+rs.getDouble(4)+"\t\t"+rs.getInt(5));
		}
	}
	
	public  void showAbsolutepos(int i) throws SQLException {
		
		rs.absolute(i); // it starts from ordering position i.e. from 1st 
		System.out.println("\nRecord in "+i+" position : ");
		System.out.println("Emp ID" +"\t"+"First_Name"+"\t"+"Last_Name"+"\t"+"Salary"+"\t\tDept No");
		System.out.println("__________________________________________________________________________________");
		System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t\t"+rs.getString(3)+"\t\t"+rs.getDouble(4)+"\t\t"+rs.getInt(5));

		rs.absolute(-5); // for negative it will give by last order
		System.out.println("\nRecord in -5 position : ");
		System.out.println("Emp ID" +"\t"+"First_Name"+"\t"+"Last_Name"+"\t"+"Salary"+"\t\tDept No");
		System.out.println("__________________________________________________________________________________");
		System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t\t"+rs.getString(3)+"\t\t"+rs.getDouble(4)+"\t\t"+rs.getInt(5));
		
		rs.relative(2); // it will show the data to last cursor point of relative i.e. last cursor
		System.out.println("\nRecord in relative 2 position : ");
		System.out.println("Emp ID" +"\t"+"First_Name"+"\t"+"Last_Name"+"\t"+"Salary"+"\t\tDept No");
		System.out.println("__________________________________________________________________________________");
		System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t\t"+rs.getString(3)+"\t\t"+rs.getDouble(4)+"\t\t"+rs.getInt(5));
		
		rs.relative(-2); // for negative it will show the data to last cursor point of relative i.e. last cursor to its reverse order
		System.out.println("\nRecord in relative -2 position : ");
		System.out.println("Emp ID" +"\t"+"First_Name"+"\t"+"Last_Name"+"\t"+"Salary"+"\t\tDept No");
		System.out.println("__________________________________________________________________________________");
		System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t\t"+rs.getString(3)+"\t\t"+rs.getDouble(4)+"\t\t"+rs.getInt(5));
		
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		ResultSetScrollingDemo obj = new ResultSetScrollingDemo();
		obj.showScrollingDataInForward();
		obj.showScrollingDataInReverse();
		obj.showAbsolutepos(4);
	}

	
	
}
