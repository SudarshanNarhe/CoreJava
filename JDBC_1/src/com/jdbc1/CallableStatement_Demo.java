package com.jdbc1;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class CallableStatement_Demo {
	
	Connection con ;
	CallableStatement cs;
	
	public static Connection getMyConnection() throws ClassNotFoundException, SQLException {
		
		Connection con = null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels?autoReconnect=true&useSSL=false","root","root");
		return con;
	}
	
	public void callingStoredProcedure() throws ClassNotFoundException, SQLException {
		
		 con = getMyConnection();
		 cs = con.prepareCall("{call getCustomerLevel(?,?)}");
		cs.setInt(1,201);
		cs.registerOutParameter(2, Types.VARCHAR);
		System.out.println(cs.execute()); // it return true when there is no any change and false it return a output
		System.out.println("Customer level is : "+cs.getString(2));
	}
	
	public void callingFunctionProcedure() throws ClassNotFoundException, SQLException {
		 con=getMyConnection();
		 cs=con.prepareCall("{?=call getOfficeCode(?)}");
		 cs.registerOutParameter(1, Types.INTEGER);
		 cs.setInt(2, 1102);
		 System.out.println(cs.execute());
		 System.out.println(cs.getInt(1));
		
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		CallableStatement_Demo obj = new CallableStatement_Demo();
		System.out.println("Calling Stored Procedure : ");
		obj.callingStoredProcedure();
		System.out.println("Calling Functions : ");
		obj.callingFunctionProcedure();
		
		
	}
	
}
