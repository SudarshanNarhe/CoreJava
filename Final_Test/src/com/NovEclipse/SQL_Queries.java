package com.NovEclipse;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class SQL_Queries {
	
	public static Connection getMyConnection() throws ClassNotFoundException, SQLException {
		
		Connection con=null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/flatinfo?autoReconnect=true&useSSL=false","root","root");	
		
		return con;
		
	}
	
	 public static void Que1() throws ClassNotFoundException, SQLException {
		 
		 //a.Write a query to  update  Ownername,mobile and email of owner of flat B111
		
				Connection con = getMyConnection();
				String sql="Update owners "
						+ " inner join flats using (oid) "
						+ " set ownername = ' Suraj Rokade ' ,"
						+ " mobile = ' 7048575829 ' ,"
						+ " email = ' suraj@425.com ' "
						+ " Where flatno = 'B111' ";
				Statement st=con.createStatement();
				int a =st.executeUpdate(sql);
				System.out.println(a + " rows Updated");
	}
	 public static void Que2() throws ClassNotFoundException, SQLException {
		 
		//b.Write query to display owner details who owns more than 1 flats.
		 
		   Connection con = getMyConnection();
		   Statement st=con.createStatement();
			String sql1 = "SET @@sql_mode = sys.list_drop(@@sql_mode, 'ONLY_FULL_GROUP_BY')";
			st=con.createStatement();
			System.out.println(st.execute(sql1));
			
			
			String sql=" select * from owners "
					+ " inner join flats using (oid) "
					+ " group by oid "
					+ " having count(oid)>1 ";
			PreparedStatement cs =con.prepareCall(sql);
			ResultSet rs = cs.executeQuery();
			while(rs.next()) {
				System.out.println("OID : "+rs.getInt(1));
				System.out.println("OName : "+rs.getString(2));
				System.out.println("Mobile : "+rs.getString(3));
				System.out.println("Email : "+rs.getString(4));
			}
	 }
	public static void Que3() throws ClassNotFoundException, SQLException {
		
		//c.Delete Flat records whose Owner is A.V.Bhat and Occupiedstatus is ‘Tenent’.
		Connection con= getMyConnection();
		String sql = " Delete flats from flats "
				+ " inner join owners using (oid) "
				+ " where ownername like '%A.V.Bhat%' and Occupiedstatus like '%Tenant%' ";
		PreparedStatement ps = con.prepareStatement(sql);
		int a =ps.executeUpdate();
		System.out.println(a + " rows Updated");
	}
	
	public static void Que4() throws ClassNotFoundException, SQLException {
		
		//e.Create a stored procedure which accepts  building name and 
		//returns Representative Name and his flat no.	
		
		Connection con = getMyConnection();
		String sql = "{call ReceiveId_returnName(?,?)}";
		CallableStatement cs = con.prepareCall(sql);
		cs.setString(1, "B");
		cs.registerOutParameter(2, Types.VARCHAR);
		cs.execute();
		System.out.println(cs.getString(2));
	}
	public static void Que5() throws ClassNotFoundException, SQLException {
		//f.Show building wise total amount of maintenance collected 
		//and total balance amountin descending order of maintenance collected.	
		Connection con= getMyConnection();
		String sql=" select substring(flatno,1,1)as 'BuildingName', sum(amount_paid)as'Collected_amount' ,sum(balance)as 'total_balance'\r\n"
				+ " from maintenance "
				+ " group by buildingName "
				+ " order by Collected_amount desc ";
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(sql);
		while(rs.next()) {
			System.out.println("\nBuilding name : "+rs.getString(1));
			System.out.print("\t\t"+"Collected Amount : "+rs.getInt(2));
			System.out.print("\t\tTotal Balance : "+rs.getInt(3));
		}
		
	}
	
	public static void createMap() throws ClassNotFoundException, SQLException {
		
		/*g.Write a jdbc program to create a map which has Flatno as key 
		 * and Owner details as  value. Do not use any joins in the query while selecting data. 
			Map Should be in descending order of Flat no*/
		Connection con= getMyConnection();
		String sql=" select f.flatno ,o.* "
				+ " from owners o, flats f "
				+ " where o.oid=f.oid";
		Statement st= con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		HashMap<String, ArrayList<Owners>> list= new HashMap<>();
		while(rs.next()) {
			
			String flatno=rs.getString(1);
			if(!list.containsKey(flatno)) {
				list.put(flatno, new ArrayList<Owners>());
			}
			list.get(flatno).add(new Owners(rs.getInt(2), rs.getString(3),rs.getString(4),rs.getString(5)));
		}
		
		for(Entry<String, ArrayList<Owners>> entry : list.entrySet()) {
			
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			
		}
		
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		System.out.println("Checking connection : "+getMyConnection());
		
//		Que1();
//		Que2();
//		Que3();
//		Que4();
//		Que5();
		createMap();
		
		 
		
	}
	
}

class Owners{
	int ownerid;
	String ownername;
	String mobile;
	String email;
	
	public Owners() {


	}

	public Owners(int ownerid, String ownername, String mobile, String email) {
		super();
		this.ownerid = ownerid;
		this.ownername = ownername;
		this.mobile = mobile;
		this.email = email;
	}

	@Override
	public String toString() {
		return "\nOwners [ownerid=" + ownerid + ", ownername=" + ownername + ", mobile=" + mobile + ", email=" + email
				+ "]";
	}
	
	
	
}
