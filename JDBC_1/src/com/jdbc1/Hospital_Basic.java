package com.jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class Hospital_Basic {
	
	
//	1.Create Connection with hospital database.
	public static Connection getMyConnection() throws ClassNotFoundException, SQLException {
		
		Connection con = null;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital?autoReconnect=true&useSSL=false","root","root");
		
		return con;
		
	}
	
//	2. List All Patient details with age above 50
	public static void patientsAbove50() throws ClassNotFoundException, SQLException {
		Connection con= getMyConnection();
		String sql= "select * from patient "
				+ " where age > ?";
		PreparedStatement pstr=con.prepareCall(sql);
		pstr.setInt(1, 50);
		ResultSet rs=pstr.executeQuery();
		while(rs.next()) {
			System.out.println("ID : "+rs.getInt(1));
			System.out.println("Name : "+rs.getString(2));
			System.out.println("Age : "+rs.getInt(3));
			System.out.println("Weight : "+rs.getFloat(4));
			System.out.println("Mail : "+rs.getString(5));
			System.out.println("Admit Date : "+rs.getDate(6));
			System.out.println("-----------------------------");
		}
		
		
	}
	
//	3. Insert new record in Patient table using PreparedStatement object. 
	public static void addNewRecord() throws ClassNotFoundException, SQLException {
		
		Connection con = getMyConnection();
		String sql="insert into patient values (?,?,?,?,?,?)";
		PreparedStatement pstr=con.prepareCall(sql);
		pstr.setInt(1, 11);
		pstr.setString(2, "Rahul");
		pstr.setInt(3, 67);
		pstr.setFloat(4, 57.67f);
		pstr.setString(5, "rahul@gmail");
		pstr.setDate(6, java.sql.Date.valueOf("2023-11-10"));
		
		int rows =pstr.executeUpdate();
		System.out.println(rows+" are inserted");
		
	}
	
//	4. Update email address of patient whose name is ‘K.V.Naik’. Use 
//	Statement object to do the same.
	public static void updateEmail() throws ClassNotFoundException, SQLException {
		
		Connection con=getMyConnection();
		String sql="Update Patient "
				+ " set email='yoga@gmail' "
				+ " where p_Name = 'Yogesh' ";
		PreparedStatement pstr=con.prepareCall(sql);
		int rows=pstr.executeUpdate();
		System.out.println(rows+" are Updated");
		
	}
	
//	5. Delete all records from patient table for given patient id. Use 
//	PreparedStatement for the same.
	public static void deleteRecord() throws ClassNotFoundException, SQLException {
		
		Connection con= getMyConnection();
		String sql="Delete from patient "
				+ " where p_id=?";
		PreparedStatement pstr=con.prepareCall(sql);
		pstr.setInt(1, 7);
		int rows =pstr.executeUpdate();
		System.out.println(rows+" rows deleted");
	}
	
//	7. Retrive all records from Patient table in Result Set and display them in 
//	reverse and forward order.
	public static void displayReverseAndForward() throws ClassNotFoundException, SQLException {
		
		Connection con = getMyConnection();
		String sql="Select * from Patient";
		PreparedStatement pstr=con.prepareCall(sql);
		ResultSet rs=pstr.executeQuery();
		ArrayList<String> list = new ArrayList<String>();
		while(rs.next()) {
			System.out.println("ID : "+rs.getInt(1));
			System.out.println("Name : "+rs.getString(2));
			System.out.println("Age : "+rs.getInt(3));
			System.out.println("Weight : "+rs.getFloat(4));
			System.out.println("Mail : "+rs.getString(5));
			System.out.println("Admit Date : "+rs.getDate(6));
			System.out.println("-----------------------------");
			
			String record="Id : "+rs.getInt(1)+", Name : "+rs.getString(2)+", Age : "+rs.getInt(3)+
						  ", Weight : "+rs.getFloat(4)+", Mail : "+rs.getString(5)+", Admit Date : "+rs.getDate(6);
			
			list.add(record);
		}
		System.out.println("Reverse Order is : ");
		Collections.reverse(list);
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	public static void reverseByStatement() throws ClassNotFoundException, SQLException {
		Connection con=getMyConnection();
		String sql="Select * from patient";
		PreparedStatement pstr=con.prepareCall(sql);
		ResultSet rs=pstr.executeQuery();
		System.out.println("\nReverse By Statement : ");
		rs.afterLast(); //to move cursor at last point 
		while(rs.previous()) {
			System.out.println("ID : "+rs.getInt(1));
			System.out.println("Name : "+rs.getString(2));
			System.out.println("Age : "+rs.getInt(3));
			System.out.println("Weight : "+rs.getFloat(4));
			System.out.println("Mail : "+rs.getString(5));
			System.out.println("Admit Date : "+rs.getDate(6));
			System.out.println("-----------------------------");
			
		}
		
	}
//	8. Delete record no 5 from resultset 
	public static void deleteFromResultSet() throws ClassNotFoundException, SQLException {
		Connection con= getMyConnection();
		Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		String sql= "select * from patient";
		ResultSet set=st.executeQuery(sql);
		showAll();
		set.absolute(5);
		set.deleteRow();
		System.out.println("After delete 5th row : ");
		showAll();
	}
	
//	 9. Insert new record in ResultSet so that it would be added in database 
//		table also.
	public static void insertByResultSet() throws ClassNotFoundException, SQLException {
		Connection con = getMyConnection();
		Statement st= con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
		String sql = "Select * from patient";
		ResultSet set=st.executeQuery(sql);
		set.moveToInsertRow();
		set.updateInt(1,5);
		set.updateString(2, "Shubhangi");
		set.updateInt(3, 35);
		set.updateFloat(4, 78.4f);
		set.updateString(5, "shubh@gmail");
		set.updateDate(6, java.sql.Date.valueOf("2023-11-19"));
		
		set.insertRow();
		showAll();
		
		
	}
	
	
// 10.Update weight to 55.50 kg for record from ResultSet where pid is 1101.
	public static void UpdateResultSet() throws ClassNotFoundException, SQLException {
		
		Connection con=getMyConnection();
		Statement st =con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		String sql = "select * from patient";
		ResultSet rs=st.executeQuery(sql);
		rs.absolute(6); // pass row number
		rs.updateDouble(4, 83.22f); // Pass column number and value
		rs.updateRow();
		
		showAll();
		
	}
	
//	for show all data 
	public static void showAll() throws ClassNotFoundException, SQLException
	{
		Connection con = getMyConnection();
		String sql="Select * from Patient";
		PreparedStatement pstr=con.prepareCall(sql);
		ResultSet rs=pstr.executeQuery();
		while(rs.next()) {
			System.out.println("ID : "+rs.getInt(1));
			System.out.println("Name : "+rs.getString(2));
			System.out.println("Age : "+rs.getInt(3));
			System.out.println("Weight : "+rs.getFloat(4));
			System.out.println("Mail : "+rs.getString(5));
			System.out.println("Admit Date : "+rs.getDate(6));
			System.out.println("-----------------------------");
		}
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
//			patientsAbove50();
//			addNewRecord();
//			updateEmail();
//			deleteRecord();
//			displayReverseAndForward();
//			reverseByStatement();
//			deleteFromResultSet();
//	     	insertByResultSet();
			UpdateResultSet();
			
		
	}
	
}
