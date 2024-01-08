package com.JulyEclipse;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class SQL_Queries {
	
	public static Connection getMyConnection() throws ClassNotFoundException, SQLException {
		
		Connection con=null;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/voterinfo?autoReconnect=true&useSSL=false","root","root");
		
		return con;
		
	}
	public static void Que1() throws ClassNotFoundException, SQLException {
		
		//Write a query to  see details of male  senior citizen(age above 60) voters  
		//who stays in Sahakar Nagar area of Pune City	
		Connection con= getMyConnection();
		String sql= " select * from voter "
				+ "  inner join residenceaddress using (VAddressID) "
				+ " where voterage>35 and gender like '%male%' and city like '%city8%' ";
		
		Statement st= con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		while(rs.next()) {
			
			System.out.println("Address id : "+rs.getInt(1));
			System.out.println("Voter Id : "+rs.getString(2));
			System.out.println("Name : "+rs.getString(3));
			System.out.println("Voting Area : "+rs.getString(4));
			System.out.println("Age : "+rs.getString(5));
			System.out.println("Adhar : "+rs.getString(6));
			System.out.println("Gender : "+rs.getString(7));
		}
		
	}
	public static void Que2() throws ClassNotFoundException, SQLException {
		
		Connection con= getMyConnection();
		String sql= " select VAddressID ,\r\n"
				+ "sum(case when gender like '%male%' then 1 else 0 end)as 'male_voters',\r\n"
				+ "sum(case when gender like '%female%' then 1 else 0 end)as 'female_voters'\r\n"
				+ "from voter\r\n"
				+ "group by VAddressID ";
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		while(rs.next()) {
			System.out.println("Address ID : "+rs.getInt(1));
			System.out.println("Male voters : "+rs.getInt(2));
			System.out.println("Female voters : "+rs.getInt(3));
		}
		
	}
	public static void callStoredProcedure() throws ClassNotFoundException, SQLException {
		
		Connection con=getMyConnection();
		String sql="{call Update_BoothId(?,?,?)} ";
		CallableStatement cs=con.prepareCall(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		cs.setInt(1, 12);
		cs.setInt(2, 1);
		cs.setString(3, "John Doe");
		
		int a =cs.executeUpdate();
		System.out.println(a+" rows Updated");
		
	}
	public static void createMap() throws ClassNotFoundException, SQLException {
		
		/*Write a jdbc program to create a map which has VoterAadhar as key 
		 * and Residence address as  value. Do not use any joins in the query while selecting data. 
			Also update Voting Area to ‘Nanded City’ where pincode is 411048.*/
		
		Connection con=getMyConnection();
		String sql= " select v.VAadhar ,r.* "
				+ " from voter v, residenceaddress r "
				+ " where v.VAddressID=r.VAddressID ";
		Statement st=con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		HashMap<String, ArrayList<Address>> map = new HashMap<>();
		while(rs.next()) {
			String key =rs.getString(1);
			if(!map.containsKey(key)) {
			     map.put(key, new ArrayList<Address>());
			}
			map.get(key).add(new Address(rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8)));

		}
	
		for(Entry<String , ArrayList<Address>> entry: map.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		System.out.println(getMyConnection());
//		Que1();
//		Que2();
//		callStoredProcedure();
		
		createMap();
		
	}
	
};

class Address{
	
	int vaddid;
	String surveyno;
	String building;
	String area;
	String pincode;
	String city;
	String state;
	
	public Address() {


	}

	public Address(int vaddid, String surveyno, String building, String area, String pincode, String city,
			String state) {
		super();
		this.vaddid = vaddid;
		this.surveyno = surveyno;
		this.building = building;
		this.area = area;
		this.pincode = pincode;
		this.city = city;
		this.state = state;
	}

	@Override
	public String toString() {
		return "\nAddress [vaddid=" + vaddid + ", surveyno=" + surveyno + ", building=" + building + ", area=" + area
				+ ", pincode=" + pincode + ", city=" + city + ", state=" + state + "]";
	}
	
		
}
