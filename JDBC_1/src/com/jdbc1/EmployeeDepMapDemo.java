package com.jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class EmployeeDepMapDemo {

			Connection con;
			Statement stemp,stdep;
			ResultSet rsemp,rsdep;
			HashMap <String , ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
			
		public EmployeeDepMapDemo() throws ClassNotFoundException, SQLException {
			con = getMyconnection();
			stemp=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			rsemp=stemp.executeQuery("select * from employees");
			stdep=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			rsdep= stdep.executeQuery("select * from departments");
			
		}
			
		public static Connection getMyconnection() throws ClassNotFoundException, SQLException {
		
		Connection con = null;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testcoursedb?autoReconnect=true&useSSL=false","root","root");
		
			return con;
		
		}
		
		public void createMap() throws SQLException {
			
			int depno=0;
			String depname=null;
			
			while(rsdep.next()) {
				
				depno=rsdep.getInt(1);
				ArrayList<String> enames= new ArrayList<String>();
				rsemp.beforeFirst();
				while(rsemp.next()) {
					
					if(depno==rsemp.getInt(11)) {
						depname=rsdep.getString(2);
						enames.add(rsemp.getString(2));
					}
				}
				map.put(depname, enames);
			}
		}
		
		public void show () {
			
			Set <Entry<String, ArrayList<String>>> set=map.entrySet();
			Iterator<Entry<String, ArrayList<String>>> itr=set.iterator();
			
			while(itr.hasNext()) {
				Entry<String, ArrayList<String>> entry=itr.next();
				if(entry.getValue().size()>0) {
					System.out.println(entry.getKey());
					System.out.println(entry.getValue());
				}
			}
			
		}
		
		public static void main(String[] args) throws ClassNotFoundException , SQLException {
			
			EmployeeDepMapDemo obj = new EmployeeDepMapDemo();
			obj.createMap();
			obj.show();
			
		}
	
}
