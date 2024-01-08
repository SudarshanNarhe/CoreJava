package com.jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetUpdateDemo {

	Connection con;
	Statement st;
	ResultSet rs;
	String sql;

	public ResultSetUpdateDemo() throws ClassNotFoundException, SQLException {

		con = getMyconnection();
		st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		sql = "select employee_id,first_name,last_name,salary,department_id " + " from employees limit 10";
		rs = st.executeQuery(sql);
	}

	public static Connection getMyconnection() throws ClassNotFoundException, SQLException {

		Connection con = null;

		Class.forName("com.mysql.cj.jdbc.Driver");

		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testcoursedb?autoReconnect=true&useSSL=false",
				"root", "root");

		return con;

	}

	public void deleteRecord(int pos) throws SQLException {
		rs.absolute(pos);
		rs.deleteRow();

	}

	public void updateRecord(int pos) throws SQLException {
		rs.absolute(pos);
		rs.updateDouble(3, 99000);
		rs.updateRow();

	}

	public void insertData() throws SQLException {
		rs.moveToInsertRow();
		rs.updateInt(1, 404);
		rs.updateString(2, "Suraj");
		rs.updateString(3, "R");
		rs.updateDouble(4, 70000);
		rs.updateInt(5, 80);
		rs.insertRow();
	}

	public void show() throws SQLException {

		System.out.println("____________________________________________________________________________________");
		System.out.println("Emp ID" + "\t" + "First_Name" + "\t" + "Last_Name" + "\t" + "Salary" + "\t\tDept No");
		System.out.println("__________________________________________________________________________________");

		rs.beforeFirst();
		while (rs.next()) {
			System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t\t" + rs.getString(3) + "\t\t"
					+ rs.getDouble(4) + "\t\t" + rs.getInt(5));
		}
	}
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		ResultSetUpdateDemo obj=new ResultSetUpdateDemo();
//		obj.deleteRecord(4);
		obj.show();
		obj.updateRecord(5);
		obj.show();
//		obj.insertData();
//		obj.show();
		
	}

}
