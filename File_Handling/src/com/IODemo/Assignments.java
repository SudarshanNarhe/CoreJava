package com.IODemo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Assignments {

	FileInputStream fin = null;
	FileOutputStream fout=null;
	BufferedInputStream bin= null;
	BufferedOutputStream bout=null;
	
	
	public void createDirectory(String str) {
		
		File f1 = new File(str);
		System.out.println(f1.mkdir());
		
	}
	
	//1. Write code to create a file.
	public void createTextfile(String str) throws IOException {
		File f1= new File(str);
		System.out.println(f1.createNewFile());
	}
	// 2. Write a Java code to write content into the file.
	public void writeContents(String str) throws IOException {
		File f1= new File(str);
		fout= new FileOutputStream(f1);
		bout= new BufferedOutputStream(fout);
		
		System.out.println("Enter some data.. ");
		int data = System.in.read();
		while(data!=50) {
			bout.write(data);
			bout.flush();
			data= System.in.read();
		}
		System.out.println("Contents Written to file...");
	}
	// 3. Write a code to Read the File on console.
	public void readContents(String str) throws IOException {
		
		File f1= new File(str);
		fin= new FileInputStream(f1);
		bin= new BufferedInputStream(fin);
		System.out.println("Contents form in files are....");
		
		int a=System.in.read();
		while(a!=-1) {
			System.out.println((char)a);
			a=bin.read();
		}
		
	}
	// 4. Write a code to copy one file content into another file.
	public void copyFiletoAnother(String src, String dest) throws IOException {
		
		fin= new FileInputStream(src);
		fout = new FileOutputStream(dest,true);
		int data = fin.read();
		while(data!=-1) {
			fout.write(data);
			fout.flush();
			data= fin.read();
		}
		System.out.println("Contents Transfered");
	}
	// 5. Write code to display file details.
	public void displayfileDetails(String str) {
		
		File f1 = new File(str);
		System.out.println("File name : " + f1.getName());
		System.out.println("Absolute path : " + f1.getAbsolutePath());
		System.out.println("It can read : " + f1.canRead());
		System.out.println("It can write : " + f1.canWrite());
		System.out.println("length : " + f1.length());
	}
	// 6. Write code to delete file.
	public void deleteFile(String str) {
		
		File f1= new File(str);
		System.out.println(f1.delete());
	}
	// 7. Write code to perform serialization to write Any Object into the file.
	public void performSerilization(String str) throws IOException {
		
		Student s2= new Student(101, "SD", 56f);
		fout= new FileOutputStream(str);
		ObjectOutputStream os= new ObjectOutputStream(fout);
		os.writeObject(s2);
		os.flush();
		os.close();
		fout.close();
		System.out.println(s2);
		System.out.println("Object Saved...");
	}
	// 8. Write code to perform to deserialization.
	public void performDeserilization(String str) throws IOException, ClassNotFoundException {
		
		Student s2= new Student(101, "SD", 56f);
		FileInputStream fis= new FileInputStream(str);
		ObjectInputStream ois= new ObjectInputStream(fis);
		s2=(Student) ois.readObject();
		System.out.println("Object shown");
		System.out.println(s2);
		ois.close();
		fis.close();
	}
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Assignments a = new Assignments();
		a.createDirectory("D:\\Assignments");
		
		a.createTextfile("D:\\Assignments\\Sudarshan.txt");
		
		a.writeContents("D:\\Assignments\\Sudarshan.txt");;
		
		a.deleteFile(null);
		
		a.readContents("D:\\Assignments\\Sudarshan.txt");
	
		a.copyFiletoAnother(null, null);
		
		a.displayfileDetails(null);
		
		a.performSerilization(null);
		
		a.performDeserilization(null);
		
	}
	
}
