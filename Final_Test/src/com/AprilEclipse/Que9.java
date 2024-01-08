package com.AprilEclipse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;


/*9. Create a collection to store acctype as key and value as list of all customers with 
respective acctype for bank name HDFC(without using joins)*/
	
public class Que9 {
	
	public static Connection myConnection() throws ClassNotFoundException, SQLException {
		
		Connection con=null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/BankDatabase?autoReconnect=true&useSSL=false","root","root");
		return con;
		
	}
	public static void createHashMap() throws ClassNotFoundException, SQLException {
		
		HashMap<String, ArrayList<Customers>> list = new HashMap<String, ArrayList<Customers>>();
		
		Connection con = myConnection();
		String sql =" select acctype from accounttype group by acctype ";
		Statement st= con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet rs= st.executeQuery(sql);
		
	String set= "SET sql_mode=(SELECT REPLACE(@@sql_mode,'ONLY_FULL_GROUP_BY',''))";
	Statement stt=con.createStatement();
	stt.executeUpdate(set);
	
		
	String sql1= "SELECT u.cust_id,cname,contact,age,pan_no,t.acctype " 
	+ " FROM bank b, customer c, accounts a, accounttype t, customer_master u "
	+" WHERE b.bank_id=c.bank_id AND c.cust_id=a.cust_id AND a.acctype_id=t.acctype_id AND u.cust_id=c.cust_id AND  b.name='ABC Bank' "; 
		
		Statement st1=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		ResultSet rs1=st1.executeQuery(sql1);
		
		while(rs.next()) {
			
			String key=rs.getString(1);
			
			ArrayList<Customers> arr = new ArrayList<Customers>();
			rs1.beforeFirst();
			while(rs1.next()) {
				String value=rs1.getString(6);
				if(key.equals(value)) {
				Customers c= new Customers(rs1.getInt(1),rs1.getString(2), rs1.getString(3), rs1.getInt(4), rs1.getString(5));
				arr.add(c);
				}
			}
			list.put(key, arr);
			
		}
		
		Iterator<Entry<String, ArrayList<Customers>>> entry = list.entrySet().iterator();
		while(entry.hasNext()) {
			
			Entry<String, ArrayList<Customers>> et= entry.next();
			System.out.println(et.getKey());
			System.out.println(et.getValue());
			
		}
		
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
//		Connection con = myConnection();
//		System.out.println(con);
		
		try {
			createHashMap();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}

class Customers {
	
	int id;
	String name, contact, pan_no;
	int age;
	
	public Customers() {
		
	}

	public Customers(int id, String name, String contact, int age, String pan_no) {
		
		this.id = id;
		this.name = name;
		this.contact = contact;
		this.pan_no = pan_no;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getPan_no() {
		return pan_no;
	}

	public void setPan_no(String pan_no) {
		this.pan_no = pan_no;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Customers [id=" + id + ", name=" + name + ", contact=" + contact + ", pan_no=" + pan_no + ", age=" + age
				+ "]";
	}
	
	
	
	
}

