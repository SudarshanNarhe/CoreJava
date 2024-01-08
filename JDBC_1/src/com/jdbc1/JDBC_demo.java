package com.jdbc1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_demo {

	public static void main(String[] args) {
		
		Connection con;
		try {
			con = MyConnection.getMySQLConnection();
			System.out.println(con);
			Statement st =con.createStatement();
			String sql ="select * from departments";
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				System.out.println("Department_id : "+rs.getInt(1));
				System.out.println("Department_Name : "+rs.getString(2));
				System.out.println("Manager_id : "+rs.getInt(3));
				System.out.println("Location_id : "+rs.getInt(4));
				System.out.println("**********************************");
			}
			sql = "insert into departments values (280,'HR',206,1800)";
			int count=st.executeUpdate(sql);
			System.out.println(count+" inserted.");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	
}
