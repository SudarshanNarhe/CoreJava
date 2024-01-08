package com.jdbc1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ConsoleAppForDatabase {
	
	Connection con;
	String sql;
	Statement st;
	ResultSet rs;
	PreparedStatement ps;
	public ConsoleAppForDatabase() throws ClassNotFoundException, SQLException {
		
	}
	
	public void showData(int table) throws ClassNotFoundException, SQLException {
		con=AllConnections.getSQLMyConnection();
		Scanner s = new Scanner(System.in);
		if(table==1) {
			System.out.println("Enter a Id to show a data : ");
			int id = s.nextInt();
			sql="select * from regions where region_id=? ";
			ps=con.prepareStatement(sql);
			ps.setInt(1, id);
			rs=ps.executeQuery();
			while(rs.next()) {
				System.out.println("The Region name is : "+rs.getString(2));
			}
		}
		else if(table==2) {
			System.out.println("Enter a Id to show a data : ");
			String id = s.next();
			sql="select * from Countries where country_id=? ";
			ps=con.prepareStatement(sql);
			ps.setString(1, id);
			rs=ps.executeQuery();
			while(rs.next()) {
				System.out.println("The Country name is : "+rs.getString(2));
			}
		}
		else if(table==3) {
			System.out.println("Enter a Id to show a data : ");
			int id = s.nextInt();
			sql="select * from locations where location_id=? ";
			ps=con.prepareStatement(sql);
			ps.setInt(1, id);
			rs=ps.executeQuery();
			while(rs.next()) {
				System.out.println("The City name is : "+rs.getString(4));
			}
		}
		else if(table==4) {
			System.out.println("Enter a Id to show a data : ");
			int id = s.nextInt();
			sql="select * from departments where department_id=? ";
			ps=con.prepareStatement(sql);
			ps.setInt(1, id);
			rs=ps.executeQuery();
			while(rs.next()) {
				System.out.println("The Department name is : "+rs.getString(2));
			}
		}
		else if(table==5) {
			System.out.println("Enter a Id to show a data : ");
			int id = s.nextInt();
			sql="select * from employees where Employee_id=? ";
			ps=con.prepareStatement(sql);
			ps.setInt(1, id);
			rs=ps.executeQuery();
			while(rs.next()) {
				System.out.println("The Employee name is : "+rs.getString(2));
			}
		}
		else {
			System.out.println("Enter a Id to show a data : ");
			String id = s.next();
			sql="select * from jobs where job_id=? ";
			ps=con.prepareStatement(sql);
			ps.setString(1, id);
			rs=ps.executeQuery();
			while(rs.next()) {
				System.out.println("The Job_Title is : "+rs.getString(2));
			}
		} 
s.close();		
	}
	
	public void addData(int table) throws ClassNotFoundException, SQLException {
		con=AllConnections.getSQLMyConnection();
		Scanner sc = new Scanner(System.in);
		if(table==1) {
			System.out.println("Enter a name of Coloumn ");
			String name= sc.next();
			sql="Alter table regions add column "+name+" varchar (40) ";
			ps=con.prepareStatement(sql);
			int a =ps.executeUpdate();
			if(a>0) {
				System.out.println("Succesfully Add Column ");
			}
			else
				System.out.println("Something Went Wrong....");
		}
		else if(table==2) {
			System.out.println("Enter a name of Coloumn ");
			String name= sc.next();
			sql="Alter table Countries add column "+name+" varchar (40) ";
			ps=con.prepareStatement(sql);
			int a =ps.executeUpdate();
			if(a>0) {
				System.out.println("Succesfully Add Column ");
			}
			else
				System.out.println("Something Went Wrong....");
		}
		else if(table==3) {
			System.out.println("Enter a name of Coloumn ");
			String name= sc.next();
			sql="Alter table Locations add column "+name+" varchar (40) ";
			ps=con.prepareStatement(sql);
			int a =ps.executeUpdate();
			if(a>0) {
				System.out.println("Succesfully Add Column ");
			}
			else
				System.out.println("Something Went Wrong....");
		}
		else if(table==4) {
			System.out.println("Enter a name of Coloumn ");
			String name= sc.next();
			sql="Alter table departments add column "+name+" varchar (40) ";
			ps=con.prepareStatement(sql);
			int a =ps.executeUpdate();
			if(a>0) {
				System.out.println("Succesfully Add Column ");
			}
			else
				System.out.println("Something Went Wrong....");
		}
		else if(table==5) {
			System.out.println("Enter a name of Coloumn ");
			String name= sc.next();
			sql="Alter table employees add column "+name+" varchar (40) ";
			ps=con.prepareStatement(sql);
			int a =ps.executeUpdate();
			if(a>0) {
				System.out.println("Succesfully Add Column ");
			}
			else
				System.out.println("Something Went Wrong....");
		}
		else {
			System.out.println("Enter a name of Coloumn ");
			String name= sc.next();
			sql="Alter table jobs add column "+name+" varchar (40) ";
			ps=con.prepareStatement(sql);
			int a =ps.executeUpdate();
			if(a>0) {
				System.out.println("Succesfully Add Column ");
			}
			else
				System.out.println("Something Went Wrong....");
		}
		
sc.close();		
	}
	
	public void deleteData(int table) throws ClassNotFoundException, SQLException {
		con=AllConnections.getSQLMyConnection();
		Scanner s = new Scanner(System.in);
		if(table==1) {
			System.out.println("Enter a Id to delete a data : ");
			int id = s.nextInt();
			sql="Delete from regions where region_id=? ";
			ps=con.prepareStatement(sql);
			ps.setInt(1, id);
			int rows=ps.executeUpdate();
			System.out.println(rows + "Data deleted Succesfully.");
		}
		else if(table==2) {
			System.out.println("Enter a Id to delete a data : ");
			String id = s.next();
			sql="Delete from Countries where country_id=? ";
			ps=con.prepareStatement(sql);
			ps.setString(1, id);
			int rows=ps.executeUpdate();
			System.out.println(rows + "Data deleted Succesfully.");
		}
		else if(table==3) {
			System.out.println("Enter a Id to delete a data : ");
			int id = s.nextInt();
			sql="delete from locations where location_id=? ";
			ps=con.prepareStatement(sql);
			ps.setInt(1, id);
			int rows=ps.executeUpdate();
			System.out.println(rows + "Data deleted Succesfully.");
		}
		else if(table==4) {
			System.out.println("Enter a Id to delete a data : ");
			int id = s.nextInt();
			sql="Delete from departments where department_id=? ";
			ps=con.prepareStatement(sql);
			ps.setInt(1, id);
			int rows=ps.executeUpdate();
			System.out.println(rows + "Data deleted Succesfully.");
		}
		else if(table==5) {
			System.out.println("Enter a Id to delete a data : ");
			int id = s.nextInt();
			sql="Delete from employees where Employee_id=? ";
			ps=con.prepareStatement(sql);
			ps.setInt(1, id);
			int rows=ps.executeUpdate();
			System.out.println(rows + "Data deleted Succesfully.");
		}
		else {
			System.out.println("Enter a Id to delete a data : ");
			String id = s.next();
			sql="Delete from jobs where job_id=? ";
			ps=con.prepareStatement(sql);
			ps.setString(1, id);
			int rows=ps.executeUpdate();
			System.out.println(rows + " Data deleted Succesfully.");
		} 
s.close();	
	}
	
	public void mainMenu() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Choose the table for perform Operations : ");
		
		System.out.println("1. Regions \n2. Countries \n3. Locations \n4. Departments \n5. Employees \n6. Jobs ");
		int table = sc.nextInt();
		System.out.println("Enter Your Choice : ");
		
		System.out.println("1. Get Name base on ID");
		System.out.println("2. Add Coloumn");
		System.out.println("3. Delete");
		System.out.println("4. Go to main Menu");
		int choice = sc.nextInt();
		try {
			ConsoleAppForDatabase obj = new ConsoleAppForDatabase();
			if(choice==1) {
			obj.showData(table);
			}
			else if(choice==2) {
			obj.addData(table);
			}
			else if (choice==3) {
			obj.deleteData(table);
			}
			else if(choice==4)
				obj.mainMenu();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
sc.close();
	
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Choose the table for perform Operations : ");
		
		System.out.println("1. Regions \n2. Countries \n3. Locations \n4. Departments \n5. Employees \n6. Jobs ");
		int table = sc.nextInt();
		System.out.println("Enter Your Choice : ");
		
		System.out.println("1. Get Name base on ID");
		System.out.println("2. Add Coloumn");
		System.out.println("3. Delete");
		System.out.println("4. Go to main Menu");
		int choice = sc.nextInt();
		
		try {
			ConsoleAppForDatabase obj = new ConsoleAppForDatabase();
			if(choice==1) {
			obj.showData(table);
			}
			else if(choice==2) {
			obj.addData(table);
			}
			else if (choice==3) {
			obj.deleteData(table);
			}
			else if(choice==4)
				obj.mainMenu();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
sc.close();
	}

}
