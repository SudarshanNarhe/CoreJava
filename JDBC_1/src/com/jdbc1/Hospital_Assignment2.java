package com.jdbc1;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Set;

public class Hospital_Assignment2 {
	
	Connection con;
	String sql;
	PreparedStatement pstr;
	ResultSet rs;
	CallableStatement cs;
	HashMap<Integer, String> map= new HashMap<Integer, String>();
	
//	1. Create Connection with hospital database.
	public static Connection getMyConnection() throws ClassNotFoundException, SQLException {
		Connection con = null;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital?autoReconnect=true&useSSL=false","root","root");
		
		return con;
	}
	
//	2. Fetch Patient names admitted after 5th May 2020 and age above 50 and 
//	store it in ArrayList.
	public void addInArrayList() throws ClassNotFoundException, SQLException {
		
		 con=getMyConnection();
		 sql = "Select * from patient where admit_date > ? and age > ? ";
		 pstr=con.prepareCall(sql);
		pstr.setDate(1, java.sql.Date.valueOf("2023-12-1"));
		pstr.setInt(2, 50);
		 rs =pstr.executeQuery();
		ArrayList<String> list = new ArrayList<String>();
		while(rs.next()) {
			String record="Id : "+rs.getInt(1)+", Name : "+rs.getString(2)+", Age : "+rs.getInt(3)+
					  ", Weight : "+rs.getFloat(4)+", Mail : "+rs.getString(5)+", Admit Date : "+rs.getDate(6);
			
		list.add(record);
		}
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
//	3. Create HashMap with patient id as key and patient Name as value and 
//	display it.	
	public void hashMapCreationByPatient_id() throws ClassNotFoundException, SQLException {
		con=getMyConnection();
		sql="select p_id, p_name from patient";
		pstr=con.prepareCall(sql);
		rs=pstr.executeQuery();
		while(rs.next()) {
			map.put(rs.getInt(1), rs.getString(2));
		}
			this.showMap();
	}
	
//	4. Create a HashMap with docid as key and list of patients treated by that 
//	doctor as value. Show all entries in HashMap
	
	public void MapByDoc_id() throws ClassNotFoundException, SQLException {
		
		sql="SELECT * FROM patient";
		con=getMyConnection();
		Statement pst=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet prs=pst.executeQuery(sql);
		
		sql="SELECT * FROM doctor ";
		Statement dst=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet drs=dst.executeQuery(sql);
		int doc_id;
		
		HashMap<Integer, ArrayList<Patient>> map = new HashMap<>();
		while(drs.next()) {
			doc_id=drs.getInt(1);
			ArrayList<Patient> list = new ArrayList<>();
			prs.beforeFirst();
			while(prs.next()) {
				if (doc_id==prs.getInt(7)) {
					Patient p = new Patient(prs.getInt(1),prs.getInt(3), prs.getFloat(4),prs.getString(2), prs.getString(5));
					list.add(p);
				}
			}
			map.put(doc_id, list);
		}
		Set<Entry<Integer, ArrayList<Patient>>>entryset=map.entrySet();
		Iterator<Entry<Integer, ArrayList<Patient>>> itr = entryset.iterator();
		while(itr.hasNext()) {
			Entry<Integer, ArrayList<Patient>> entry=itr.next();
			System.out.println(entry.getKey()+"    "+entry.getValue());
		}
}
	
//	5. Create a Set of patient ids and sort it in descending order of patient ids.
	public void SetCreation() throws ClassNotFoundException, SQLException {
		con=getMyConnection();
		sql="Select p_id from patient";
		pstr=con.prepareCall(sql);
		rs=pstr.executeQuery();
		LinkedList<Integer> arr = new LinkedList<Integer>();
		while(rs.next()) {
			arr.add(rs.getInt(1));
		}
		Collections.reverse(arr);
		Set<Integer> idset= new LinkedHashSet<Integer>(arr);
		System.out.println(idset);
	}
	
//	6. Create Stored Procedure in database which takes pid as input parameter 
//	and returns patient age and name as output parameters. Call this 
//	procedure through java application.
	public void callingStoredProcedure() throws ClassNotFoundException, SQLException {
		
		con=getMyConnection();
		cs = con.prepareCall("{call get_AgeAndName (?,?,?) }");
		cs.setInt(1, 9);
		cs.registerOutParameter(2, Types.INTEGER);
		cs.registerOutParameter(3, Types.VARCHAR);
		cs.execute();
		System.out.println("Age : "+cs.getInt(2)+"   Name : "+cs.getString(3));
		
	}
	
//	7. Create a Stored Procedure which takes Doctor’s name as input 
//	parameter and returns his speciality as output parameter. Call this stored 
//	procedure in java Application
	
	public void callingSpforDocNam() throws ClassNotFoundException, SQLException {
		con=getMyConnection();
		cs=con.prepareCall("{call get_DoctorSpecialist (?,?)}");
		cs.setString(1,"Sunil");
		cs.registerOutParameter(2, Types.VARCHAR);
		cs.execute();
		System.out.println("Specialist : "+cs.getString(2));
		
	}
	
//	8. Create Stored Procedure which takes doctor id as input parameter and 
//	returns patient name, patient id and his age as result Set. Call This Stored 
//	Procedure in Java Application
	
	public void SPPatientInfoByDoc_ID() throws ClassNotFoundException, SQLException {
		con = getMyConnection();
		cs=con.prepareCall("{call get_Patient(?)}");
		cs.setInt(1,101);
		rs=cs.executeQuery();
		while(rs.next()) {
	
			System.out.println("Patient ID : "+rs.getInt(1)+"  Patient Name : "+rs.getString(2)+"  Age : "+rs.getInt(3));
		}
//		CallableStatement cs1 = con.prepareCall("{call get_PatientInfoByDoc(?)}");
//		cs1.setInt(1, 101);
//		ResultSet rs1 =cs1.executeQuery();
//		while(rs1.next()) {
//			System.out.println("pid : "+rs1.getInt(1)+" pname : "+rs1.getString(2)+" age : "+rs1.getInt(3));
//		}
//	
	}
//	9. Create Function to return count of patients admitted on given date and 
//		call this function in java Application.
	
	public void FnOfCountPatients() throws ClassNotFoundException, SQLException {
		
		con=getMyConnection();
		cs=con.prepareCall("{ ? = call get_countOfPatients (?)}");
		cs.setDate(2, java.sql.Date.valueOf("2023-12-18"));
		cs.registerOutParameter(1, Types.INTEGER);
		cs.execute();
		System.out.println("Total count of Patients : "+cs.getInt(1));
	}
	
	public void showMap() {
		
		Set<Entry<Integer, String>>entryset=map.entrySet();
		Iterator<Entry<Integer, String>> itr = entryset.iterator();
		while(itr.hasNext()) {
			Entry<Integer, String> entry=itr.next();
			System.out.println(entry.getKey()+"    "+entry.getValue());
		}
				
		
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Hospital_Assignment2 obj = new Hospital_Assignment2();
		obj.addInArrayList();
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("Map By Patient id as a key and Name a Value : ");
		obj.hashMapCreationByPatient_id();
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("Map By Doc_id and Patients : ");
		obj.MapByDoc_id();
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("Sorting Id By desc Using Set : ");
		obj.SetCreation();
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("Calling Stored Procedure : ");
		obj.callingStoredProcedure();
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("Stored Procedure for Doctor Name as Input and return Specialist : ");
		obj.callingSpforDocNam();
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("Stored Procedure for Doctor ID as Input and return Patients Info : ");
		obj.SPPatientInfoByDoc_ID();
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("Function for count a Patients for date : ");
		obj.FnOfCountPatients();
	}
	
}
